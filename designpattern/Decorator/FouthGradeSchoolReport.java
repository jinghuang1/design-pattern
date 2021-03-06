package Decorator;

/**
 * @author jinhuan3
 * @date 2/23/2022 - 10:57 PM
 */
public class FouthGradeSchoolReport extends SchoolReport{

  //我的成绩单
  @Override
  public void report() {
    //成绩单的格式是这个样子的
    System.out.println("尊敬的XXX家长:");
    System.out.println("......");
    System.out.println(" 语文 62 数学 65 体育 98 自然 63");
    System.out.println("......");
    System.out.println("                 家长签名:     ");
  }

  //家长签名
  @Override
  public void sign(String name) {
    System.out.println("家长签名为: "+name);
  }

}
