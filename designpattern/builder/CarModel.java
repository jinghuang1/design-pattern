package builder;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 10:58 PM
 * 定义一个车辆模型的抽象类，所有的车辆模型都继承这个类
 */
public abstract class CarModel {

  //这个参数是各个基本方法执行的顺序
  private ArrayList<String> sequence = new ArrayList<String>();

  /**
   * 模型是启动开始跑了
   */
  protected abstract void start();

  //能发动，那还是要停下来，那才是行
  protected abstract void stop();

  //喇叭会发出声音，是滴滴还是哔哔
  protected abstract void alarm();

  //引擎要回发出轰轰轰的响声
  protected abstract void engineBoom();

  //模型是会跑的，不管是人推，还是电力驱动
  final public void run(){

    //虚幻一遍，谁在前，就先执行谁
    for (int i = 0; i<this.sequence.size(); i++){
      String actionName = this.sequence.get(i);

      if(actionName.equalsIgnoreCase("start")){
        this.start();
      }else if(actionName.equalsIgnoreCase("stop")){
        this.stop();
      }else if(actionName.equalsIgnoreCase("alarm")){
        this.alarm();
      }else if(actionName.equalsIgnoreCase("engine boom")){
        this.engineBoom();
      }
    }
  }

  //把传递过来的值传递到类内部
  final public void setSequence(ArrayList<String> sequence){
    this.sequence = sequence;
  }
}
