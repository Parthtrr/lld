package com.dp.abstract_factory.factory;



public class RoundThemeFactory implements ThemeFactory {
  int buttonRadius, checkboxRadius;

  public RoundThemeFactory(int buttonRadius, int checkboxRadius) {
    this.buttonRadius = buttonRadius;
    this.checkboxRadius = checkboxRadius;
  }

  @Override
  public ButtonFactory getButtonFactory() {
    return new RoundButtonFactory(this.buttonRadius);
  }

  @Override
  public CheckBoxFactory getCheckBoxFactory() {
    return new RoundCheckboxFactory(this.checkboxRadius);
  }
}
