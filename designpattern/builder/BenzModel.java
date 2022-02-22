package builder;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 11:06 PM
 */
public class BenzModel extends CarModel{

  @Override
  protected void start() {
    System.out.println("奔驰跑起来...");
  }

  @Override
  protected void stop() {
    System.out.println("奔驰车停止...");
  }

  @Override
  protected void alarm() {
    System.out.println("奔驰车的喇叭声音...");
  }

  @Override
  protected void engineBoom() {
    System.out.println("奔驰车的引擎声音...");
  }
}
