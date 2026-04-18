package com.dp.abstract_factory;

import com.dp.abstract_factory.factory.PrimaryThemeFactory;
import com.dp.abstract_factory.factory.RoundThemeFactory;
import com.dp.abstract_factory.factory.ThemeFactory;
import com.dp.abstract_factory.model.PrimaryButton;
import com.dp.abstract_factory.model.RoundButton;

import com.dp.abstract_factory.model.Button;
import org.junit.Assert;
import org.junit.Test;

public class TestAbstractFactory {

  @Test
  public void test() {
    ThemeFactory primaryThemeFactory = new PrimaryThemeFactory(1,1);
    ThemeFactory roundThemeFactory = new RoundThemeFactory(2,2);
    Button roundButton = roundThemeFactory.getButtonFactory().create();
    Button primaryButton = primaryThemeFactory.getButtonFactory().create();
    Assert.assertTrue(roundButton instanceof RoundButton);
    Assert.assertTrue(primaryButton instanceof PrimaryButton);
  }
}
