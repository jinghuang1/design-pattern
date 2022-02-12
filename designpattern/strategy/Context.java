package strategy;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 3:32 PM
 * 策略的应用场景
 */
public class Context {
  private IStrategy iStrategy;

  public Context(IStrategy iStrategy){
    this.iStrategy = iStrategy;
  }

  public void operate(){
    iStrategy.operate();
  }
}
