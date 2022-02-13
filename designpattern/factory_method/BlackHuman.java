package factory_method;

/**
 * @author jinhuan3
 * @date 2/13/2022 - 11:09 PM
 * 黑色人种
 */
public class BlackHuman implements Human{

  @Override
  public void laugh() {
    System.out.println("黑色人种哭");
  }

  @Override
  public void cry() {
    System.out.println("黑色人种笑");
  }

  @Override
  public void talk() {
    System.out.println("黑色人种说话");
  }
}
