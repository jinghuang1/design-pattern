package bridge.Product;

/**
 * @author jinhuan3
 * @date 2/20/2022 - 11:01 PM
 * House产品类
 */
public class House extends Product {

  @Override
  public void beProducted() {
    System.out.println("生产出的房子是这个样子的...");
  }

  @Override
  public void beSelled() {
    System.out.println("生产出的房子卖出去了...");
  }
}
