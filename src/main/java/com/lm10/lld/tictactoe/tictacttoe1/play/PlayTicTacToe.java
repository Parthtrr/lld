//package com.lm10.lld.tictactoe.tictacttoe1.play;
//
//import ch.qos.logback.core.testUtil.RandomUtil;
//import com.lm10.lld.tictactoe.tictacttoe1.dto.Board;
//import com.lm10.lld.tictactoe.tictacttoe1.dto.Cell;
//import com.lm10.lld.tictactoe.tictacttoe1.dto.Game;
//import com.lm10.lld.tictactoe.tictacttoe1.dto.INPUTS;
//import com.lm10.lld.tictactoe.tictacttoe1.dto.Player;
//
//import java.util.List;
//import java.util.Random;
//
//public class PlayTicTacToe {
//  private Game game;
//
//  public PlayTicTacToe(Player human, Player bot, Board board, Game game) {
//    this.game = game;
//  }
//
//  public Cell getInputs() {
//    int i=0;
//    int j=0;
//    INPUTS input = INPUTS.X;
//    return new Cell(i,j,input);
//  }
//
//  public Player whoStarts(List<Player> players) {
//    return players.get(new Random().nextInt(0, players.size()));
//  }
//
//  public Player play(Board board, Cell cell) {
//
//
//    return winner;
//  }
//
//  private boolean validateCell(Cell cell, Board board) {
//    return true;
//  }
//}
