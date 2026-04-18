package com.dp.abstract_factory.factory;

import com.dp.abstract_factory.model.Button;
import com.dp.abstract_factory.model.PrimaryButton;

public interface ButtonFactory {
  Button create();
}
