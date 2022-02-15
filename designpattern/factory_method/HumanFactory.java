package factory_method;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author jinhuan3
 * @date 2/13/2022 - 11:11 PM
 * 定义八卦炉，用来造人
 */
public class HumanFactory {

//  //创建人类时需要指定人类的类型（黑、黄、白）
//  public static Human create(Class c){
//   Human human = null;    //定义一个类型的人类
//
//    try {
//      human = (Human) Class.forName(c.getName()).newInstance();
//    } catch (InstantiationException e) {
//      System.out.println("必须指定人类的颜色");
//    } catch (IllegalAccessException e) {      //定义的人类有问题，那就烤不出来了
//      System.out.println("定义的人类错误！");
//    } catch (ClassNotFoundException e) {      //你随便所以个人类，制造不了
//      e.printStackTrace();
//    }
//    return human;
//  }
//
//
//  //女娲生气了，把一团泥扔到八卦炉，想产生什么人类都行
//  public static Human create(){
//    Human human = null;
//
//    //获得多少个实现类，多少个人类
//    List<Class> concreateHumanList = ClassUtils.getAllClassByInterface(Human.class);  //定义了多少人类
//
//    //八卦炉自己开始想烧出什么人就什么人
//    Random random = new Random();
//    int rand = random.nextInt(concreateHumanList.size());
//
//    human = create(concreateHumanList.get(rand));
//
//    return human;
//  }

  //定义一个MAP，初始化过的Human对象都放在这里
  private static HashMap<String,Human> humans = new HashMap<String,Human>();

  //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
  public static Human createHuman(Class c){
    Human human = null;                 //定义一个类型的人类

    try {
      //如果MAP中有，则直接从中取出，不用初始化了
      if (humans.containsKey(c.getSimpleName())){
          human = humans.get(c.getSimpleName());
      }else {
        human = (Human) Class.forName(c.getName()).newInstance();
        //放到MAP中
        humans.put(c.getSimpleName(), human);
        }
      } catch (InstantiationException e) {      //你要是不说个人类颜色的话，没法烤，要白的黑的，你说了才好烤
       System.out.println("必须指定人类的颜色");
      } catch (IllegalAccessException e) {      //一定定义的人类有问题，那就烤不出来，这是....
       System.out.println("人类定义错误");
      } catch (ClassNotFoundException e) {      //你随便说个人类，我到哪里给你制造去？！
       System.out.println("混蛋，你指定的人类找不到！");
      }
      return human;
    }
  }