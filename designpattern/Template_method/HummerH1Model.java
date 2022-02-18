package Template_method;

/**
 * @author jinhuan3
 * @date 2/18/2022 - 10:18 PM
 */
public class HummerH1Model extends HummerModel{

  private boolean alarmFlag = true;             //是否要响喇叭

  @Override
  public void start() {
    System.out.println("悍马H1启动...");
  }

  @Override
  public void stop() {
    System.out.println("悍马H1停止...");
  }

  @Override
  public void alarm() {
    System.out.println("悍马H1鸣笛...");
  }

  @Override
  public void engineBoom() {
    System.out.println("悍马H1的引擎声音是这样的...");
  }

  @Override
  protected boolean isAlarm() {
    return this.alarmFlag;
  }

  //要不要响喇叭，是有客户来决定的
  public void setAlarm(boolean isAlarm){
    this.alarmFlag = isAlarm;
  }
}
