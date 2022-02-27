package Composite;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/25/2022 - 11:19 PM
 * 组装这个树形结构，并展示出来
 */
public class Client {

  public static void main(String[] args) {

    //首先是组装一个组织机构出来
    Branch ceo = compositeCorpTree();

    //首先把CEO的信息打印出来
    System.out.println(ceo.getInfo());

    //然后是所有员工信息
    System.out.println(getTreeInfo(ceo));

  }

  //把整个树组装起来
  public static Branch compositeCorpTree(){
    //首先产生总经理CEO
    Branch root = new Branch("王大麻子","总经理",100000);

    //产生三个部门经理
    Branch developDep = new Branch("刘大瘸子","研发部门经理",10000);
    Branch salesDep = new Branch("马二拐子","销售部门经理",20000);
    Branch financeDep = new Branch("赵三驼子","财务部经理",30000);

    //再把三个小组长产生出来
    Branch firstDevGroup = new Branch("杨三斜","开发一组组长",5000);
    Branch secondDevGroup = new Branch("吴大棒槌","开发二组组长",6000);

    //剩下的既是我们这些小兵，就是路人甲，路人乙
    Leaf a = new Leaf("a","开发人员",2000);
    Leaf b = new Leaf("b","开发人员",2000);
    Leaf c = new Leaf("c","开发人员",2000);
    Leaf d = new Leaf("d","开发人员",2000);
    Leaf e = new Leaf("e","开发人员",2000);
    Leaf f = new Leaf("f","开发人员",2000);
    Leaf g = new Leaf("g","开发人员",2000);
    Leaf h = new Leaf("h","销售人员",2000);
    Leaf i = new Leaf("i","销售人员",2000);
    Leaf j = new Leaf("j","财务人员",2000);
    Leaf k = new Leaf("k","CEO秘书",2000);
    Leaf zhengLaoLiu = new Leaf("郑老六","研发部副总",20000);

    //开始组装
    //CEO下面有三个部门经理和一个秘书
    root.addSubordinate(developDep);
    root.addSubordinate(salesDep);
    root.addSubordinate(financeDep);
    root.addSubordinate(k);

    //定义研发经理
    developDep.addSubordinate(firstDevGroup);
    developDep.addSubordinate(secondDevGroup);
    developDep.addSubordinate(zhengLaoLiu);

    //看看开发两个开发小组下有什么
    firstDevGroup.addSubordinate(a);
    firstDevGroup.addSubordinate(b);
    firstDevGroup.addSubordinate(c);
    secondDevGroup.addSubordinate(d);
    secondDevGroup.addSubordinate(e);
    secondDevGroup.addSubordinate(f);

    //再看销售部下的人员情况
    salesDep.addSubordinate(h);
    salesDep.addSubordinate(i);

    //最后一个财务
    financeDep.addSubordinate(j);

    return root;
  }

  //遍历整棵树，只要给我根节点，我就能遍历出所有的节点
  private static String getTreeInfo(Branch root){
    ArrayList<ICorp> subordinateList = root.getSubordinateInfo();
    String info = "";
    for (ICorp s : subordinateList){
      if (s instanceof Leaf){             //是员工就直接获得信息
        info = info + s.getInfo()+"\n";
      }else{
        info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
      }
    }
    return info;
  }
}
