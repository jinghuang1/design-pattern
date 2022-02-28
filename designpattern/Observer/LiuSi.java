package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jinhuan3
 * @date 2/27/2022 - 11:29 PM
 * 刘斯这个人，也是个观察者，只要韩非子有活动，这边就知道
 * 杜撰的人名
 */
public class LiuSi implements Observer {

  //刘斯是个观察者，一旦韩非子有活动，自己也做一定的事情
  public void update(Observable observable,Object obj) {
    System.out.println("刘斯：观察到韩非子活动，自己也开始活动...");
    this.happy(obj.toString());
    System.out.println("刘斯：真真是哭死...\n");
  }

  //一看到韩非子有活动，就快乐
  private void happy(String context){
    System.out.println("刘斯:因为"+context+",---所以我快乐啊！");
  }
}
