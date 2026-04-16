package com.lm10.lld.tictactoe.tictacttoe1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Player {
  private String name;
  private int diagonal;
  private int row;
  private int column;
}
