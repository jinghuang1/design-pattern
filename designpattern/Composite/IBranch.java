package Composite;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/25/2022 - 10:25 PM
 * 这写下边有小兵或者是经理等风云人物
 */
public interface IBranch {

  //能够增加小兵（树叶节点）或者经理（树枝节点）
  public void addSubordinate(ICorp corp);

  //获得下属信息
  public ArrayList<ICorp> getSubordinateInfo();

  /***
   * 本应该还有一个方法delSubordinate(ICorp corp),删除下属
   * 这个方法我们没有用到就不写进来了
   */
}
