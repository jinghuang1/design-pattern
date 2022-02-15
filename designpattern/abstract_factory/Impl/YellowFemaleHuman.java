package abstract_factory.Impl;

import abstract_factory.Abstract.AbstractYellowHuman;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:03 PM
 */
public class YellowFemaleHuman extends AbstractYellowHuman {

  @Override
  public void sex() {
    System.out.println("黄种人，女性!");
  }

}
