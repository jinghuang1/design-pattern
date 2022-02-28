package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jinhuan3
 * @date 2/27/2022 - 11:26 PM
 * 王斯，也是观察者，杜撰的人名
 */
public class WangSi implements Observer {

  //王斯是个观察者，一旦韩非子有活动，他就受不了
  public void update(Observable observable,Object obj) {
    System.out.println("王斯：观察到韩非子活动，自己也开始活动...");
    this.cry(obj.toString());
    System.out.println("王斯：真真是哭死...\n");
  }

  //一看到韩非子有活动，就哭
  private void cry(String context){
    System.out.println("王斯:因为"+context+",---所以我悲伤啊！");
  }
}
