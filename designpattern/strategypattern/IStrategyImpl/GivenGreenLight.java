package strategypattern.IStrategyImpl;

import strategypattern.IStrategy;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 3:29 PM
 */
public class GivenGreenLight implements IStrategy {

  @Override
  public void operate() {
    System.out.println("开绿灯........");
  }
}
