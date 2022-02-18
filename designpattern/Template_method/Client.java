package Template_method;

/**
 * @author jinhuan3
 * @date 2/18/2022 - 10:35 PM
 * 客户开始使用这个模型
 */
public class Client {

  public static void main(String[] args) {
    //客户开着H1型号，出去遛弯了
    HummerH1Model h1 = new HummerH1Model();
    h1.setAlarm(true);
    h1.run();

    //客户开H2型号，出去玩耍了
    HummerH2Model h2 = new HummerH2Model();
    h2.run();
  }
}
