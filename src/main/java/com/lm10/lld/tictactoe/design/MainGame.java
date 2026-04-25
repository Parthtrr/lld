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
    int totalMoves = 0;
    Player p1 = Player.builder().name("p1").rank(2).input(Input.X).build();
    Player p2 = Player.builder().name("p2").rank(3).input(Input.O).build();
    Board board = new Board(3,3);

    Game game = new TicTacToeConventional(board, new Player[]{p1, p2});

    Scanner scanner = new Scanner(System.in);
    Player previousPlayer = null;
    while (true) {
      Player play = game.whoWillMakeMove(game.players, previousPlayer);

      System.out.println("Player " + play.getName() + " enter the x coordinate");
      int x = scanner.nextInt();
      System.out.println("Player " + play.getName() + " enter the y coordinate");
      int y = scanner.nextInt();
      if(!validate(board, x, y)){
        System.out.println("Invalid coordinate");
        continue;
      }
      previousPlayer = play;
      Cell cell = Cell.builder().x(x).y(y).player(play).input(play.getInput()).build();
      totalMoves += 1;
      if(totalMoves == board.getLength()*board.getWidth()) {
        System.out.println("Game drawn");
        return;
      }
      game.makeMove(board, cell);
      Input winner = game.getWinner(board);
      printBoard(board);
      if (winner !=null) {
        if (winner == p1.getInput()) {
          System.out.println("And the winner is = " + p1.getName());
          return;
        } else {
          System.out.println("And the winner is = " + p2.getName() );
          return;
        }
      }
    }

  }

  private static boolean validate(Board board, int x, int y) {
    Cell[][] cells = board.getBoard();
    if(x<0 || y<0 || x>=cells.length || y>=cells[0].length || cells[x][y].getInput() != Input.EMPTY) {
      return false;
    }
    return true;
  }

  static void printBoard(Board board) {
    for (int i = 0; i < board.getLength(); i++) {
      for (int j = 0; j < board.getLength(); j++) {
        System.out.print(board.getBoard()[i][j].getInput() + " ");
      }
      System.out.println();
    }
  }
}
