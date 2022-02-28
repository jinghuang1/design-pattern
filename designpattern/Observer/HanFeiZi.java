package Observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author jinhuan3
 * @date 2/27/2022 - 10:34 PM
 * 韩非子，李斯的师弟，韩国的重要人物
 */
public class HanFeiZi extends Observable {

  //韩非子要吃饭了
  public void haveBreakfast() {
    System.out.println("韩非子：开始吃饭了...");
    //通知所有观察者
    super.setChanged();
    this.notifyObservers("韩非子在吃饭");
  }

  //韩非子开始娱乐了
  public void haveFun() {
    System.out.println("韩非子：开始娱乐了...");
    super.setChanged();
    this.notifyObservers("韩非子在娱乐");
  }
}
