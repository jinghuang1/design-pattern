package Decorator;

/**
 * @author jinhuan3
 * @date 2/23/2022 - 11:01 PM
 * 老爸看成绩单了
 */
public class Father {

  public static void main(String[] args) {
    //成绩单拿过来
   SchoolReport sr = new FouthGradeSchoolReport();                   //原装的成绩单

    //加了最高分说明的成绩单
    sr = new HighScoreDecorator(sr);

    //加了成绩排名的说明
    sr = new SortDecorator(sr);

    //美化，老爸一看，很开心，就签名了
    sr.sign("老三");                                            //我叫小三，老爸当然叫老三
  }
}
