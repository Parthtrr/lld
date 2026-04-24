package com.lm10.lld.tictactoe.design.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Game {
  public Board board;
  public Player[] players;
  public abstract void makeMove(Board board, Cell cell);
  public abstract Player getWinner(Board board);
  public abstract Player whoWillMakeMove(Player[] players, int previous);
}
