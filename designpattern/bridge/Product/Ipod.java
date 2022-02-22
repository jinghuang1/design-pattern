package bridge.Product;

/**
 * @author jinhuan3
 * @date 2/20/2022 - 11:06 PM
 */
public class Ipod extends Product{

  @Override
  public void beProducted() {
    System.out.println("生产出的iPod是这样的...");
  }

  @Override
  public void beSelled() {
    System.out.println("生产出的iPod卖出去了...");
  }
}
