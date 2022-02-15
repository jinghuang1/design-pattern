package abstract_factory.Abstract;

import abstract_factory.Human;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 10:57 PM
 * 为什么改成抽象类？要定义性别，定义抽象类，防止你new出来对象
 */
public abstract class AbstractBlackHuman implements Human {

  @Override
  public void cry() {
    System.out.println("黑色人种会哭");
  }

  @Override
  public void laugh() {
    System.out.println("黑色人类会笑");
  }

  @Override
  public void talk() {
    System.out.println("黑色人类会说话");
  }

}
