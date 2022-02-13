package factory_method;

import java.util.List;
import java.util.Random;
import sun.misc.ClassLoaderUtil;

/**
 * @author jinhuan3
 * @date 2/13/2022 - 11:11 PM
 * 定义八卦炉，用来造人
 */
public class HumanFactory {

  //创建人类时需要指定人类的类型（黑、黄、白）
  public static Human create(Class c){
   Human human = null;    //定义一个类型的人类

    try {
      human = (Human) Class.forName(c.getName()).newInstance();
    } catch (InstantiationException e) {
      System.out.println("必须指定人类的颜色");
    } catch (IllegalAccessException e) {      //定义的人类有问题，那就烤不出来了
      System.out.println("定义的人类错误！");
    } catch (ClassNotFoundException e) {      //你随便所以个人类，制造不了
      e.printStackTrace();
    }
    return human;
  }


  //女娲生气了，把一团泥扔到八卦炉，想产生什么人类都行
  public static Human create(){
    Human human = null;

    //获得多少个实现类，多少个人类
    List<Class> concreateHumanList = ClassUtils.getAllClassByInterface(Human.class);  //定义了多少人类

    //八卦炉自己开始想烧出什么人就什么人
    Random random = new Random();
    int rand = random.nextInt(concreateHumanList.size());

    human = create(concreateHumanList.get(rand));

    return human;
  }
}
