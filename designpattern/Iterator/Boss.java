package Iterator;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/24/2022 - 11:16 PM
 * 老大来看项目信息了
 */
public class Boss {

  public static void main(String[] args) {
    //定义一个List,存放所有的项目对象
    IProject project = new Project();

    //增加星球大战项目
    project.add("星球大战项目",10,100000);
    //增加扭转时空项目
    project.add("扭转时空项目",100,1000000);
    //增加超人改造项目
    project.add("超人改造项目",100000,10000000);

    //这边100个项目
    for (int i = 4;i<104;i++){
      project.add("第"+i+"个项目",i*5,i*10000);
    }

    //遍历一下ArrayList,把所有的数据都取出
    IProjectIterator projectIterator = project.iterator();
    while (projectIterator.hasNext()){
      IProject p = (IProject)projectIterator.next();
      System.out.println(p.getProjectInfo());
    }
  }
}
