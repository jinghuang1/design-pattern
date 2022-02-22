package bridge;

import bridge.Product.Product;

/**
 * @author jinhuan3
 * @date 2/20/2022 - 10:46 PM
 * 我是山寨之王，你流行啥我就生产啥
 */
public class ShanZhaiCorp extends Corp{

  //生产什么产品,不知道,等被调用的才知道
  public ShanZhaiCorp(Product product) {
    super(product);
  }

  //狂挣钱
  @Override
  public void makeMoney() {
    super.makeMoney();
    System.out.println("我赚钱呀...");
  }
}
