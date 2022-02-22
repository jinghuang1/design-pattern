package command;

/**
 * @author jinhuan3
 * @date 2/22/2022 - 10:26 PM
 * 美工组的职责是设计出一套漂亮、简单、便捷的界面
 */
public class PageGroup extends Group{

  //客户要求美工组过去和他们谈
  @Override
  public void find() {
    System.out.println("找到美工组...");
  }

  //客户要求增加一个页面
  @Override
  public void add() {
    System.out.println("客户要求增加一个页面...");
  }

  //客户要求删除一个页面
  @Override
  public void delete() {
    System.out.println("客户要求删除个页面...");
  }

  //客户要求修改一个页面
  @Override
  public void change() {
    System.out.println("客户要求修改一个页面...");
  }

  //所有的增删改要给出计划
  @Override
  public void plan() {
    System.out.println("客户要求页面变更计划...");
  }
}
