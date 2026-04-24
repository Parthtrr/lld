package com.lm10.lld.tictactoe.design.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Board {
  private int length;
  private int width;
  private Cell[][] board;
  public Board(int length, int width) {
    this.length = length;
    this.width = width;
    board = new Cell[length][width];
  }
}
