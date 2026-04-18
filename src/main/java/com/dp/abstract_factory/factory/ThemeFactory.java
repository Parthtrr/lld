package com.dp.abstract_factory.factory;

import com.dp.abstract_factory.factory.ButtonFactory;

public interface ThemeFactory {
  ButtonFactory getButtonFactory();
  CheckBoxFactory getCheckBoxFactory();

}
