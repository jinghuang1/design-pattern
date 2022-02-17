package adapter;

import adapter.InSys.IUserInfo;
import adapter.OutSys.OuterUser;
import java.util.Map;

/**
 * @author jinhuan3
 * @date 2/17/2022 - 10:55 PM
 * 适配器,接口的装换:继承被转换业务的实现类，实现转换业务的接口
 * 把OuterUser 包装成UserInfo
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

  private Map baseInfo = super.getUserBaseInfo();           //员工的基本信息
  private Map homeInfo = super.getUserHomeInfo();           //员工的家庭信息
  private Map officeInfo = super.getUserOfficeInfo();       //工作信息

  /**
   * 员工姓名
   * @return
   */
  @Override
  public String getUserName() {
    String userName = (String) this.baseInfo.get("userName");
    System.out.println(userName);
    return userName;
  }

  /**
   * 家庭住址
   * @return
   */
  @Override
  public String getUserAddress() {
    String homeAddress = (String) this.homeInfo.get("homeAddress");
    System.out.println(homeAddress);
    return homeAddress;
  }

  /**
   * 获得员工的移动电话
   * @return
   */
  @Override
  public String getMobileNumber() {
    String mobileNumber = (String) this.homeInfo.get("homeTelNumber");
    System.out.println(mobileNumber);
    return mobileNumber;
  }

  /**
   * 获取员工的办公室电话
   * @return
   */
  @Override
  public String getOfficeNumber() {
    String officeNumber = (String) this.officeInfo.get("officeTelNumber");
    System.out.println(officeNumber);
    return officeNumber;
  }

  /**
   * 获得员工的职位信息
   * @return
   */
  @Override
  public String getJobPosition() {
    String jobPosition = (String) this.officeInfo.get("jobPosition");
    System.out.println(jobPosition);
    return jobPosition;
  }

  /**
   * 获取家庭电话
   * @return
   */
  @Override
  public String getHomeTelNumber() {
    String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
    System.out.println(homeTelNumber);
    return homeTelNumber;
  }
}
