package abstract_factory.Impl;

import abstract_factory.Abstract.AbstractBlackHuman;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:05 PM
 */
public class BlackFemaleHuman extends AbstractBlackHuman {

  @Override
  public void sex() {
    System.out.println("黑种人，女性");
  }
}
