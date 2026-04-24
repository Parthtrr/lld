package com.lm10.lld.tictactoe.design;

import com.lm10.lld.tictactoe.design.impl.TicTacToeConventional;
import com.lm10.lld.tictactoe.design.pojo.Board;
import com.lm10.lld.tictactoe.design.pojo.Cell;
import com.lm10.lld.tictactoe.design.pojo.Game;
import com.lm10.lld.tictactoe.design.pojo.Input;
import com.lm10.lld.tictactoe.design.pojo.Player;

import java.util.Objects;
import java.util.Scanner;

public class MainGame {
  public static void main(String[] args) {
    Player p1 = Player.builder().name("p1").rank(2).build();
    Player p2 = Player.builder().name("p2").rank(3).build();
    Player bot1 = Player.builder().name("bot1").rank(4).build();
    Board board = new Board(3,3);

    Game game = new TicTacToeConventional(board, new Player[]{p1, bot1});

    Scanner scanner = new Scanner(System.in);
    printBoard(board);
    while (true) {
      Player play = game.whoWillMakeMove(game.players, -1);
      System.out.println("Player " + play.getName() + " enter the x coordinate");
      int x = scanner.nextInt();
      System.out.println("Player " + play.getName() + " enter the y coordinate");
      int y = scanner.nextInt();
      System.out.println("Player " + play.getName() + " enter the Input X or O");
      Input input = Objects.equals(scanner.next(), Input.X.name()) ? Input.X : Input.O ;
      Cell cell = Cell.builder().x(x).y(y).player(play).input(input).build();
      game.makeMove(board, cell);
      Player winner = game.getWinner(board);
      printBoard(board);
      if (winner !=null) {
        System.out.println("And the winner is = " + winner.getName());
        return;
      }
    }

  }
  static void printBoard(Board board) {
    for (int i = 0; i < board.getLength(); i++) {
      for (int j = 0; j < board.getLength(); j++) {
        System.out.print(board.getBoard()[i][j] + " ");
      }
      System.out.println();
    }
  }
}
