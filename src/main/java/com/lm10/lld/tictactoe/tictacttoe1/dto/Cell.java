package com.lm10.lld.tictactoe.tictacttoe1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Cell {
  private int x;
  private int y;
  private INPUTS input;
}
