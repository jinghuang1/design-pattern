package adapter.InSys;

/**
 * @author jinhuan3
 * @date 2/17/2022 - 10:22 PM
 * 用户信息对象
 */
public interface IUserInfo {

  //获得用户姓名
  public String getUserName();

  //获得家庭地址
  public String getUserAddress();

  //手机号码
  public String getMobileNumber();

  //办公电话，一般式座机
  public String getOfficeNumber();

  //这个人的职位是啥
  public String getJobPosition();

  //获得家庭电话
  public String getHomeTelNumber();
}
