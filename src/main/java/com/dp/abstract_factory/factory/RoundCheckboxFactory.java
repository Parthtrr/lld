package com.dp.abstract_factory.factory;

import com.dp.abstract_factory.model.Checkbox;

public class RoundCheckboxFactory implements CheckBoxFactory {
  int side;
  public RoundCheckboxFactory(int side){
    this.side = side;
  }

  @Override
  public Checkbox createCheckbox() {
    return new RoundCheckboxFactory(side).createCheckbox();
  }
}
