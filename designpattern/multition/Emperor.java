package multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author jinhuan3
 * @date 2/12/2022 - 11:19 PM
 * 多例模式：对象的数量有上限
 */
public class Emperor {

  private static int maxNumOfEmperor = 2;                                     //最多只能有2个皇帝

  private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);  //皇帝叫什么名字

  private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);      //装皇帝的列表

  private static int countNumOfEmperor = 0;                                   //正在被人尊称的是哪个

  //先把两个皇帝产生出来
  static {
    for (int i = 0; i < maxNumOfEmperor; i++){
      emperorList.add(new Emperor("皇" +(i+1)+ "帝"));
    }
  }

  //就这么多皇帝，不允许再生成Emperor
  private Emperor(){

  }

  private Emperor(String info){
    emperorInfoList.add(info);
  }

  public static Emperor getInstance(){
    Random random = new Random();
    countNumOfEmperor = random.nextInt(maxNumOfEmperor);                      //随机拉出一个皇帝
    return (Emperor) emperorList.get(countNumOfEmperor);
  }

  //皇帝叫什么名字
  public static void emperorInfo(){
    System.out.println(emperorInfoList.get(countNumOfEmperor));
  }
}
