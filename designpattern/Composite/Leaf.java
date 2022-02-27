package Composite;

/**
 * @author jinhuan3
 * @date 2/25/2022 - 10:30 PM
 * Leaf是树叶节点，在这里就是我们这写小兵
 */
public class Leaf implements ICorp{
  //小兵叫什么名字
  private String name = "";
  //小兵的职位
  private String position = "";
  //小兵的薪水
  private int salary = 0;

  //通过构造函数传递小兵的信息
  public Leaf(String name, String position, int salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  //获得小兵的信息
  @Override
  public String getInfo() {
    String info = "";
    info = "名称: " + this.name;
    info = info + "\t职位: " + this.position;
    info = info + "\t薪水: " + this.salary;
    return info;
  }
}
