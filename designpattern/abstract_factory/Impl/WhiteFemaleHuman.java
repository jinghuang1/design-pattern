package abstract_factory.Impl;

import abstract_factory.Abstract.AbstractWhiteHuman;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:05 PM
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {

  @Override
  public void sex() {
    System.out.println("白种人，女性");
  }
}
