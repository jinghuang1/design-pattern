package chain_of_responsibility;

/**
 * @author jinhuan3
 * @date 3/1/2022 - 10:36 PM
 */
public class Father extends Handler{

  //父亲只处理女儿的请求
  public Father(){
    super(1);
  }

  //父亲的答复
  @Override
  public void response(IWomen women) {
    System.out.println("--------女儿向父亲请示---------");
    System.out.println(women.getRequest());
    System.out.println("父亲的回答是:同意\n");
  }
}
