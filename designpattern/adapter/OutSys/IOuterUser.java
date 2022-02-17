package adapter.OutSys;

import java.util.Map;

/**
 * @author jinhuan3
 * @date 2/17/2022 - 10:32 PM
 * 外系统的人员信息
 */
//@SuppressWarnings("all")
public interface IOuterUser {

  //基本信息，比如姓名，性别，手机号码
  public Map getUserBaseInfo();

  //工作区域信息
  public Map getUserOfficeInfo();

  //用户的家庭信息
  public Map getUserHomeInfo();
}
