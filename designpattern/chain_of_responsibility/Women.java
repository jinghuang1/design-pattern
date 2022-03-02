package chain_of_responsibility;

/**
 * @author jinhuan3
 * @date 3/1/2022 - 10:30 PM
 */
public class Women implements IWomen{

  /**
   * 通过一int类型的参数来描述妇女的个人状况
   * 1---未出嫁
   * 2---出嫁
   * 3---夫死
   * @return
   */
  private int type = 0;

  //妇女的请示
  private String request = "";

  //构造函数传递过来请求

  public Women(int _type, String _request) {
    this.type = _type;

    switch (this.type){
      case 1:
        this.request = "女儿的请求是: " + _request;
        break;
      case 2:
        this.request = "妻子的请求是: " + _request;
        break;
      case 3:
        this.request = "母亲的请求是: " + _request;
    }
  }

  //获得自己的状况
  @Override
  public int getType() {
    return this.type;
  }

  //获得妇女的请求
  @Override
  public String getRequest() {
    return this.request;
  }
}
