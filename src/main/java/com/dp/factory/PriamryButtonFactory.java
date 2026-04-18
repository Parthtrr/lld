package com.dp.factory;

public class PriamryButtonFactory implements ButtonFactory {
  int side;
  public PriamryButtonFactory(int side){
    this.side = side;
  }
  @Override
  public Button create() {
    return new PrimaryButton(this.side);
  }
}
