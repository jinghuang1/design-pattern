package Iterator;

/**
 * @author jinhuan3
 * @date 2/24/2022 - 11:08 PM
 * 定义一个接口，所有项目都是一个接口
 */
public interface IProject {

  //增加项目
  public void add(String name,int num,int cost);

  //从老板这里看到的就是项目信息
  public String getProjectInfo();

  //获得一个可以被遍历的对象
  public IProjectIterator iterator();

}
