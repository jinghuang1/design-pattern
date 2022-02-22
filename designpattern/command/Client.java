package command;

/**
 * @author jinhuan3
 * @date 2/22/2022 - 10:34 PM
 * 客户就是甲方，给我们钱的人，是老大
 */
public class Client {

  public static void main(String[] args) {

   //定义接头人
    Invoker invoker = new Invoker();

    //客户要求增加一项需求
    System.out.println("-------客户要求增加一项需求-------");
    //客户给我们下命令
    Command command = new AddRequirementCommand();

    //接头人接受到命令
    invoker.setCommand(command);

    //接头人执行命令
    invoker.action();
  }
}
