package sigleton;

/**
 * @author jinhuan3
 * @date 2/12/2022 - 11:12 PM
 * Emperor单例模式在多线程下存在问题，这里写一个通用的单例类
 */
public class Singleton {

  //直接new一个对象传递给类的成员变量SINGLETON,你要的时候getInstance()直接返给你，解决问题！
  private static final Singleton SINGLETON = new Singleton();

  //限制住不能直接产生一个实例
  private Singleton(){

  }

  public synchronized static Singleton getInstance(){
    return SINGLETON;
  }

}
