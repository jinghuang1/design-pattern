package abstract_factory;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 10:49 PM
 * 定义一个人类的统称，问题出来了，刚刚定义的时候忘记定义性别了
 */
public interface Human {
  //首先定义什么是人类

  //人是愉快的，会笑的
  public void laugh();

  //人是痛苦的，会哭
  public void cry();

  //人类会说话
  public void talk();

  //定义性别
  public void sex();
}



