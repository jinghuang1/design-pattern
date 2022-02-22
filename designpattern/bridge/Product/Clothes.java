package bridge.Product;

/**
 * @author jinhuan3
 * @date 2/20/2022 - 11:04 PM
 * 我集团生产的衣服
 */
public class Clothes extends Product{

  @Override
  public void beProducted() {
    System.out.println("生产出的衣服是这个样子的...");
  }

  @Override
  public void beSelled() {
    System.out.println("生产出的衣服卖出去了...");
  }
}
