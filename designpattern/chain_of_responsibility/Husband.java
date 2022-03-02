package chain_of_responsibility;

/**
 * @author jinhuan3
 * @date 3/1/2022 - 10:38 PM
 * 丈夫类
 */
public class Husband extends Handler{

  //丈夫只处理妻子的请求
  public Husband(){
    super(2);
  }

  //丈夫的答复
  @Override
  public void response(IWomen women) {
    System.out.println("--------妻子向丈夫请示---------");
    System.out.println(women.getRequest());
    System.out.println("丈夫的回答是:同意\n");
  }
}
