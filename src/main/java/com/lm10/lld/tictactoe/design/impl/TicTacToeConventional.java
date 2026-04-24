package com.lm10.lld.tictactoe.design.impl;

import com.lm10.lld.tictactoe.design.pojo.Board;
import com.lm10.lld.tictactoe.design.pojo.Cell;
import com.lm10.lld.tictactoe.design.pojo.Game;
import com.lm10.lld.tictactoe.design.pojo.Player;

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
  public Player getWinner(Board board) {
    //logic to identify the winner
    if(board.getBoard()[0][0] != null) {
      return board.getBoard()[0][0].getPlayer();
    }
    return null;
  }

  @Override
  public Player whoWillMakeMove(Player[] players, int previous) {
    return players[(previous+1) % players.length];
  }
}
