package Iterator;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/24/2022 - 11:30 PM
 * 定义一个迭代器
 */
public class ProjectIterator implements IProjectIterator{

  //所有的项目都放在这里ArrayList中
  private ArrayList<IProject> projectList = new ArrayList<IProject>();

  private int currentItem = 0;

  public ProjectIterator(ArrayList<IProject> projectList) {
    this.projectList = projectList;
  }

  //判断是否还有元素，必须实现
  @Override
  public boolean hasNext() {
    //定义一个返回值
    boolean b = true;
    if(this.currentItem>=projectList.size() ||
    this.projectList.get(this.currentItem) == null) {
      b = false;
    }
    return b;
  }

  //取得下一个值
  @Override
  public IProject next() {
    return (IProject) this.projectList.get(this.currentItem++);
  }

  //删除一个对象
  @Override
  public void remove() {
    //暂时没有用到
  }
}
