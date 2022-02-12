package proxy.QinLouMenu;

import proxy.DaYe;
import proxy.QinLouNvZi;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 3:52 PM
 */
public class PanJinLian implements QinLouNvZi {

  @Override
  public void makeEyesWithMan(DaYe daYe) {
    System.out.println("潘金莲抛媚眼给 "+daYe.getName());
  }

  @Override
  public void happyWithMan(DaYe daYe) {
    System.out.println("潘金莲HappyWith "+daYe.getName());
  }
}
