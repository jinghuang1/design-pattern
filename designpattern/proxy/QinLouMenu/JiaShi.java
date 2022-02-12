package proxy.QinLouMenu;

import proxy.DaYe;
import proxy.QinLouNvZi;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 4:04 PM
 * 贾氏找到LaoBo,也想入青楼，
 * LaoBo说可以，但是你要拥有QinLouNvZi的功能，于是JiaShi实现了QinLouNvZi
 */
public class JiaShi implements QinLouNvZi {

  @Override
  public void makeEyesWithMan(DaYe daYe) {
    System.out.println("贾氏抛媚眼给 "+daYe.getName());
  }

  @Override
  public void happyWithMan(DaYe daYe) {
    System.out.println("贾氏HappyWith "+daYe.getName());
  }
}
