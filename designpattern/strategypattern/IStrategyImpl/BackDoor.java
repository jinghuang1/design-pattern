package strategypattern.IStrategyImpl;

import java.util.logging.Logger;
import strategypattern.IStrategy;

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
