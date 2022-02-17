package adapter;

import adapter.InSys.IUserInfo;
import adapter.InSys.UserInfo;

/**
 * @author jinhuan3
 * @date 2/17/2022 - 10:29 PM
 * 具体的应用，插叙信息
 */
public class App {

  public static void main(String[] args) {
//    //没有与外系连接的时候，是这样写的
//    IUserInfo youngGirl = new UserInfo();

    //找人力资源，引入外部人员
    IUserInfo youngGirl = new OuterUserInfo();

    //从数据库中查询101个
    for (int i = 0; i < 101; i++){
      youngGirl.getMobileNumber();
    }
  }
}
