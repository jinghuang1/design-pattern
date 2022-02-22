package command;

/**
 * @author jinhuan3
 * @date 2/22/2022 - 10:49 PM
 * 增加一项需求
 */
public class AddRequirementCommand extends Command{

  //执行增加一项需求的命令
  @Override
  public void execute() {
    //找到需求组
    super.rg.find();

    //增加一份需求
    super.rg.add();

    //给出计划
    super.rg.plan();
  }
}
