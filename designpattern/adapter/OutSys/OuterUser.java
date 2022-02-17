package adapter.OutSys;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinhuan3
 * @date 2/17/2022 - 10:36 PM
 * 外系统的用户信息的实现类
 */
public class OuterUser implements IOuterUser{

  /**
   *
   * @return 员工的基本信息
   */
  @Override
  public Map getUserBaseInfo() {
    HashMap<String, String> baseInfoMap = new HashMap<>();
    baseInfoMap.put("userName", "这个员工叫做sss...");
    baseInfoMap.put("mobileNumber", "这个员工电话是...");
    return baseInfoMap;
  }

  /**
   *
   * @return 员工的办公区信息
   */
  @Override
  public Map getUserOfficeInfo() {
    HashMap<String, String> officeInfo = new HashMap<>();
    officeInfo.put("jobPosition", "这个员工的职位是Boss...");
    officeInfo.put("officeTelNumber", "这个员工的办公电话是...");
    return officeInfo;
  }

  /**
   *
   * @return 员工家庭信息
   */
  @Override
  public Map getUserHomeInfo() {
    HashMap<String, String> homeInfo = new HashMap<>();
    homeInfo.put("homeTelNumber", "这个员工的家庭电话是...");
    homeInfo.put("homeAddress", "这个员工的家庭住址是...");
    return homeInfo;
  }
}
