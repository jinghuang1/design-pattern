package proxypattern;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 4:14 PM
 * 构建一个大爷类，假如西门庆某天带着小弟一起来玩呢
 * 小弟和西门庆都是大爷
 */
public class DaYe {

  private String name;

  public DaYe(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
