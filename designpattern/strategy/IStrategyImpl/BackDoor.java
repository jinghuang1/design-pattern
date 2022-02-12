package strategy.IStrategyImpl;

import strategy.IStrategy;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 3:28 PM
 */
public class BackDoor implements IStrategy {

  @Override
  public void operate() {
    System.out.println("开后门.........");
  }
}
