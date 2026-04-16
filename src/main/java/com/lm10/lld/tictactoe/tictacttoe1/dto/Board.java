package com.lm10.lld.tictactoe.tictacttoe1.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Builder
public class Board {
  private int length;
  private int width;
  private List<Cell> cells;
}
