package builder;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 11:15 PM
 * 要什么顺序的车，我给你建出来
 */
public abstract class CarBuilder {

  //建造一个模型，你要给我一个组装顺序
  public abstract void setSequence(ArrayList<String> sequence);

  //设置完毕顺序,就可以直接拿到这个车辆模型
  public abstract CarModel getCarModel();
}
