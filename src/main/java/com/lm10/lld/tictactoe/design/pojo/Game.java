package com.lm10.lld.tictactoe.design.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Game {
  public Board board;
  public Player[] players;
  public Game(Board board, Player[] players) {
    this.board = board;
    this.players = players;
    for(int i=0;i< board.getLength(); i++){
      for(int j=0;j< board.getWidth(); j++){
        board.getBoard()[i][j] = Cell.builder().x(i).y(j).input(Input.EMPTY).build();
      }
    }
  }
  public abstract void makeMove(Board board, Cell cell);
  public abstract Input getWinner(Board board);
  public abstract Player whoWillMakeMove(Player[] players, Player previous);
}
