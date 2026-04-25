package com.lm10.lld.tictactoe.design.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Player {
  private String name;
  private int rank;
  private Input input;
}
