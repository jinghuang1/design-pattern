package Composite;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/25/2022 - 10:35 PM
 * 这些树枝节点也就是这些领导们既要有自己的信息，还要知道自己的下属情况
 */
public class Branch implements IBranch, ICorp{

  //领导也是人，也有名字
  private String name= "";
  //领导和领导的职位也是又去别的
  private String position = "";
  //领导也是拿薪水的
  private int salary = 0;
  //领导下边有那些下级领导和小兵
  private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();

  //通过构造函数传递领导的参数
  public Branch(String name, String position, int salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  //增加一个下属，可能是小头目，也可能是个小兵
  @Override
  public void addSubordinate(ICorp corp) {
    this.subordinateList.add(corp);
  }

  //获取下属的信息
  @Override
  public ArrayList<ICorp> getSubordinateInfo() {
    return this.subordinateList;
  }

  //获得领导的信息
  @Override
  public String getInfo() {
    String info = "";
    info = "名称: " + this.name;
    info = info +"\t职位: " + this.position;
    info = info +"\t薪水: " + this.salary;
    return info;
  }
}
