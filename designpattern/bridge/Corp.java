package bridge;

import bridge.Product.Product;

/**
 * @author jinhuan3
 * @date 2/20/2022 - 10:39 PM
 * 定义一个公司的抽象类
 */
public abstract class Corp {

  //定义一个产品对象，抽象的了，不知道具体是什么产品
  private Product product;

  //构造函数，由子类定义传递具体的产品进来
  public Corp(Product product){
    this.product = product;
  }

  //公司需要赚钱
  public void makeMoney(){

    //每个公司都是一样，先生产
    this.product.beProducted();

    //然后销售
    this.product.beSelled();
  }
}
