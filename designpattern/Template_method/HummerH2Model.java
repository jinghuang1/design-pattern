package Template_method;

/**
 * @author jinhuan3
 * @date 2/18/2022 - 10:18 PM
 */
public class HummerH2Model extends HummerModel{

  @Override
  public void start() {
    System.out.println("悍马H2启动...");
  }

  @Override
  public void stop() {
    System.out.println("悍马H2停止...");
  }

  @Override
  public void alarm() {
    System.out.println("悍马H2鸣笛...");
  }

  @Override
  public void engineBoom() {
    System.out.println("悍马H2的引擎声音是这样的...");
  }

  //默认没有喇叭
  @Override
  protected boolean isAlarm() {
    return false;
  }
}
