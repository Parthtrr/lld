package com.dp.abstract_factory.factory;

import com.dp.abstract_factory.factory.ButtonFactory;
import com.dp.abstract_factory.factory.PriamryButtonFactory;
import com.dp.abstract_factory.factory.RoundButtonFactory;

public class PrimaryThemeFactory implements ThemeFactory {
  int buttonSide, checkBoxSide;

  public PrimaryThemeFactory(int buttonSide, int checkBoxSide) {
    this.buttonSide = buttonSide;
    this.checkBoxSide = checkBoxSide;
  }

  @Override
  public ButtonFactory getButtonFactory() {
    return new PriamryButtonFactory(this.buttonSide);
  }

  @Override
  public CheckBoxFactory getCheckBoxFactory() {
    return new PrimaryCheckboxFactory(this.checkBoxSide);
  }
}
