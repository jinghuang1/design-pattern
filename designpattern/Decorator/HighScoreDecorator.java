package Decorator;

/**
 * @author jinhuan3
 * @date 2/23/2022 - 11:21 PM
 * 我要把全校最高成绩告诉我老爸
 */
public class HighScoreDecorator extends Decorator{

  //构造函数
  public HighScoreDecorator(SchoolReport sr) {
    super(sr);
  }

  //我要汇报最高成绩
  private void reportHighScore(){
    System.out.println("这次考试语文最高是75，数学是78，自然是80");
  }

  //最高成绩我要做老爸看成绩单之前告诉他，否则等他一看，就要挨打
  @Override
  public void report() {
    this.reportHighScore();
    super.report();
  }
}
