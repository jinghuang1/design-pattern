package multition;

/**
 * @author jinhuan3
 * @date 2/12/2022 - 11:30 PM
 * 大臣们找个皇帝就需要参拜
 */
public class Minister {

  public static void main(String[] args) {
    int ministerNum = 10;       //10个大臣

    for (int i = 0; i < ministerNum; i++){
      Emperor emperor = Emperor.getInstance();
      System.out.println("第" +(i+1) + "个大臣参拜的是: "  );
      emperor.emperorInfo();
    }
  }

}
