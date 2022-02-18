package Template_method;

/**
 * @author jinhuan3
 * @date 2/18/2022 - 10:13 PM
 * Hummer Model:悍马车辆模型
 */
public abstract class HummerModel {

  /**
   * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动
   */
  protected abstract void start();

  //能发动，自然要能够停止

  protected abstract void stop();

  //车有喇叭，会发出声音
  protected abstract void alarm();

  //引擎的声音
  protected abstract void engineBoom();


  //模型应该会跑
  public final void run(){

    //先发动汽车
    this.start();

    //引擎开始轰鸣
    this.engineBoom();

    //开始跑，路上遇到人，鸣笛
    if (this.isAlarm()){
      this.alarm();
    }

    //到达目的地停车
    this.stop();
  }

  //钩子方法，默认喇叭是会响
  protected boolean isAlarm(){
    return true;
  }
}
