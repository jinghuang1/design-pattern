package bridge.Product;

/**
 * @author jinhuan3
 * @date 2/20/2022 - 10:57 PM
 * 这是我整个集团公司的产品类
 */
public abstract class Product {

  //甭管是什么产品它总要是被生产出来
  public abstract void beProducted();

  //生产出来的东西，一定要销售出去，否则折本
  public abstract void beSelled();
}
