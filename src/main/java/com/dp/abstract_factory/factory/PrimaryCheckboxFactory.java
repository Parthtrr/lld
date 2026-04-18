package com.dp.abstract_factory.factory;

import com.dp.abstract_factory.model.Button;
import com.dp.abstract_factory.model.Checkbox;
import com.dp.abstract_factory.model.PrimaryButton;

;

public class PrimaryCheckboxFactory implements CheckBoxFactory {
  int side;
  public PrimaryCheckboxFactory(int side){
    this.side = side;
  }

  @Override
  public Checkbox createCheckbox() {
    return new PrimaryCheckboxFactory(side).createCheckbox();
  }
}
