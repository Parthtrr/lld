package com.lm10.lld.tictactoe.tictacttoe1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Game {
  private Board board;
  List<Player> players;
}
