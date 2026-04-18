package com.dp.abstract_factory.factory;

import com.dp.abstract_factory.model.Button;
import com.dp.abstract_factory.model.PrimaryButton;

;

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
