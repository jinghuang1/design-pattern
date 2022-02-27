package Decorator;

/**
 * @author jinhuan3
 * @date 2/23/2022 - 11:17 PM
 * 装饰类，我要把我的成绩单装饰一下
 */
public abstract class Decorator extends SchoolReport{

  //首先我要知道是哪个成绩单
  private SchoolReport sr;

  //构造函数，传递成绩单过来
  public Decorator(SchoolReport sr){
    this.sr = sr;
  }

  //成绩单还是要被看到
  public void report(){
    this.sr.report();
  }

  //看完还是要签名
  public void sign(String name){
    this.sr.sign(name);
  }
}
