package builder;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 11:10 PM
 * 客户最终开始使用这个模型
 */
public class Client {

  public static void main(String[] args) {

    /**
     * 客户告诉公司，我要这样的一个模型
     */
   Director director = new Director();

   //1k辆A类型的奔驰车
    for (int i = 0; i < 1000; i++){
      director.getABenzModel().run();
    }

    //100量B类型的奔驰车
    for (int i = 0; i < 100; i++){
      director.getBBenzModel().run();
    }

    //10量C类型的宝马车
    for (int i = 0; i < 10; i++){
      director.getCBWMModel().run();
    }
  }
}
