package facade;

/**
 * @author jinhuan3
 * @date 2/16/2022 - 10:07 PM
 * 开始给朋友写信
 */
public class Client {

  public static void main(String[] args) {
    //现代化的邮局，有这项服务，邮局名称叫Hell Road
    ModenPostOffice hellRoadPostOffice = new ModenPostOffice();

    //你只要把信的内容和收信地址给他，他会帮你完成一系列的工作
    String address = "Happy Road No.666,God Province,Heaven";       //定义地址
    String context = "Hello,It;s me, do you know who I am?I'm your old lover. I'd like to....";
    hellRoadPostOffice.sendLetter(context, address);
  }
}
