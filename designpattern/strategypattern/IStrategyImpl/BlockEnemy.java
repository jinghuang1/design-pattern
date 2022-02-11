package strategypattern.IStrategyImpl;

import strategypattern.IStrategy;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 3:30 PM
 */
public class BlockEnemy implements IStrategy {

  @Override
  public void operate() {
    System.out.println("阻击追兵......");
  }
}
