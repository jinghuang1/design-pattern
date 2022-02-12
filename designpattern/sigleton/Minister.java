package sigleton;

/**
 * @author jinhuan3
 * @date 2/12/2022 - 11:07 PM
 * 定义大臣，大臣天天需要面见皇帝，并且是同一个
 */
public class Minister {

  public static void main(String[] args) {
    //第一天
    Emperor emperor1 = Emperor.getInstance();
    emperor1.emperorInfo();

    //第二天
    Emperor emperor2 = Emperor.getInstance();
    emperor2.emperorInfo();

    //第三天
    Emperor emperor3 = Emperor.getInstance();
    emperor3.emperorInfo();

  }
}
