package abstract_factory.Impl;

import abstract_factory.Abstract.AbstractYellowHuman;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:04 PM
 */
public class YellowMaleHuman extends AbstractYellowHuman {

  @Override
  public void sex() {
    System.out.println("黄种人，男性");
  }
}
