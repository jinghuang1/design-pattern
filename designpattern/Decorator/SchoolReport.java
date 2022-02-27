package Decorator;

/**
 * @author jinhuan3
 * @date 2/23/2022 - 10:54 PM
 * 成绩单的抽象类
 */
public abstract class SchoolReport {

  //成绩单的主要展示的就是你的成绩情况
  public abstract void report();

  //成绩单要家长签字，这个最要命
  public abstract void sign(String name);
}
