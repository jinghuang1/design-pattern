package sigleton;

/**
 * @author jinhuan3
 * @date 2/12/2022 - 11:02 PM
 * 中国历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个
 */
public class Emperor {

  private static Emperor emperor = null;      //定义一个皇帝放在那里，然后给这个皇帝名字

  private Emperor(){
    //私有的构造器，使外部不能调用创建Emperor对象
  }

  public static Emperor getInstance(){
    if(emperor == null){
      emperor = new Emperor();
    }
    return emperor;
  }

  //皇帝叫什么名字
  public static void emperorInfo(){
    System.out.println("我就是皇帝某某某....");
  }
}
