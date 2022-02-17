package adapter.InSys;

import adapter.InSys.IUserInfo;

/**
 * @author jinhuan3
 * @date 2/17/2022 - 10:25 PM
 */
public class UserInfo implements IUserInfo {

  @Override
  public String getUserName() {
    System.out.println("姓名叫做...");
    return null;
  }

  @Override
  public String getUserAddress() {
    System.out.println("员工的家庭住址...");
    return null;
  }

  @Override
  public String getMobileNumber() {
    System.out.println("员工的手机号码是113213123...");
    return null;
  }

  @Override
  public String getOfficeNumber() {
    System.out.println("员工的办公室电话是...");
    return null;
  }

  @Override
  public String getJobPosition() {
    System.out.println("员工的职位是Boss...");
    return null;
  }

  @Override
  public String getHomeTelNumber() {
    System.out.println("员工的家庭电话是...");
    return null;
  }
}
