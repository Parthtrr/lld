package com.lm10.lld.tictactoe.design.impl;

import com.lm10.lld.tictactoe.design.pojo.Board;
import com.lm10.lld.tictactoe.design.pojo.Cell;
import com.lm10.lld.tictactoe.design.pojo.Game;
import com.lm10.lld.tictactoe.design.pojo.Input;
import com.lm10.lld.tictactoe.design.pojo.Player;

import java.util.Random;

public class TicTacToeConventional extends Game {

  public TicTacToeConventional(Board board, Player[] players) {
    super(board, players);
  }

  @Override
  public void makeMove(Board board, Cell cell) {
    Cell[][] gameBoard = board.getBoard();
    gameBoard[cell.getX()][cell.getY()] = cell;
  }

  @Override
  public Input getWinner(Board board) {
    Cell[][] cells = board.getBoard();
    //logic to identify the winner
    int[] row = new int[board.getLength()];
    int[] column = new int[board.getWidth()];
    int[] diagonal = new int[2];
    for (int i = 0; i < board.getLength(); i++) {
      for (int j = 0; j < board.getLength(); j++) {
        int x = 0;
        if(cells[i][j].getInput() == Input.X) x=1;
        else if(cells[i][j].getInput() == Input.O) x=-1;

        row[i] += x;
        column[j] += x;
        if(i==j) {
          diagonal[0] += x;
        }
        if(i+j==board.getLength()) {
          diagonal[1] += x;
        }
      }
    }
    if(diagonal[0]==3 || diagonal[1]==3 ) {
      return Input.X;
    }
    if(diagonal[0]==-3 || diagonal[1]==-3) {
      return Input.O;
    }
    for(int i = 0; i < board.getLength(); i++) {
      if(row[i] == 3 || column[i] == 3) {
        return Input.X;
      }
      if (row[i] == -3 || column[i] == -3) {
        return Input.O;
      }
    }
    return null;
  }

  @Override
  public Player whoWillMakeMove(Player[] players, Player previous) {
    if(previous == null ) {
      return players[new Random().nextInt(players.length)];
    }
    if(previous.equals(players[0])) {
      return players[1];
    }
    return players[0];
  }
}
