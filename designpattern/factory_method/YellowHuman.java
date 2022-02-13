package factory_method;

/**
 * @author jinhuan3
 * @date 2/13/2022 - 11:07 PM
 * 黄色人种
 */
public class YellowHuman implements Human{

  @Override
  public void laugh() {
    System.out.println("黄色人种哭");
  }

  @Override
  public void cry() {
    System.out.println("黄色人种笑");
  }

  @Override
  public void talk() {
    System.out.println("黄色人种说话");
  }
}
