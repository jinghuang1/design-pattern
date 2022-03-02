package chain_of_responsibility;

/**
 * @author jinhuan3
 * @date 3/1/2022 - 10:28 PM
 * 古代悲哀女性的总称
 */
public interface IWomen {

  //获得个人状况
  public int getType();

  //获得个人请示，你要干什么？出去逛街？约会？看电影
  public String getRequest();
}
