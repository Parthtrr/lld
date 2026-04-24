package com.lm10.lld.tictactoe.design.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Cell {
  private int x;
  private int y;
  private Input input;
  private Player player;
}
