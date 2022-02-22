package builder;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 11:09 PM
 */
public class BMWModel extends CarModel{

  @Override
  protected void start() {
    System.out.println("宝马跑起来...");
  }

  @Override
  protected void stop() {
    System.out.println("宝马车停止...");
  }

  @Override
  protected void alarm() {
    System.out.println("宝马车的喇叭声音...");
  }

  @Override
  protected void engineBoom() {
    System.out.println("宝马车的引擎声音...");
  }
}
