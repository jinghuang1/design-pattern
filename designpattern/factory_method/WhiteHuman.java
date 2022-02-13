package factory_method;

/**
 * @author jinhuan3
 * @date 2/13/2022 - 11:08 PM
 * 白色人种
 */
public class WhiteHuman implements Human{

  @Override
  public void laugh() {
    System.out.println("白色人种哭");
  }

  @Override
  public void cry() {
    System.out.println("白色人种笑");
  }

  @Override
  public void talk() {
    System.out.println("白色人种说话");
  }
}
