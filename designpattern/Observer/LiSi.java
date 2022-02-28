package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jinhuan3
 * @date 2/27/2022 - 10:40 PM
 * 李斯这个人，是个观察者，只要韩非子一有动静，这边就知道
 */
public class LiSi implements Observer {

  //首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
  public void update(Observable observable,Object ob) {
    System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
    this.reportToQiShiHuang(ob.toString());
    System.out.println("李斯：汇报完毕，秦始皇赏他两个罗布迟迟...\n");
  }

  //汇报给秦始皇
  private void reportToQiShiHuang(String reportContext){
    System.out.println("李斯:报告老板！韩非子有活动了--->"+reportContext);
  }

}
