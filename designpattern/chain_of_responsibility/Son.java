package chain_of_responsibility;

/**
 * @author jinhuan3
 * @date 3/1/2022 - 10:39 PM
 * 儿子类
 */
public class Son extends Handler{

  //父亲只处理女儿的请求
  public Son(){
    super(3);
  }

  //儿子的答复
  @Override
  public void response(IWomen women) {
    System.out.println("--------母亲向儿子请示---------");
    System.out.println(women.getRequest());
    System.out.println("儿子的回答是:同意\n");
  }
}
