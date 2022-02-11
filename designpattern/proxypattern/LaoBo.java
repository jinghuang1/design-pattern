package proxypattern;

import proxypattern.QinLouMenu.PanJinLian;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 3:53 PM
 */
public class LaoBo implements QinLouNvZi {

  private QinLouNvZi qinLouNvZi;

  //默认做潘金莲的代理
  public LaoBo(){
    this.qinLouNvZi = new PanJinLian();
  }

  //通过有参构造WangPo，可以做任意KindWomen的代理
  public LaoBo(QinLouNvZi qinLouNvZi){
    this.qinLouNvZi = qinLouNvZi;
  }

  @Override
  public void makeEyesWithMan(DaYe daYe) {
    this.qinLouNvZi.makeEyesWithMan(daYe);
  }

  @Override
  public void happyWithMan(DaYe daYe) {
    this.qinLouNvZi.happyWithMan(daYe);
  }
}
