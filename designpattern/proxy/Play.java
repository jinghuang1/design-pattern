package proxy;

import proxy.QinLouMenu.JiaShi;
import proxy.QinLouMenu.PanJinLian;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 4:18 PM
 */
public class Play {

  public static void main(String[] args) {
    DaYe daYe1 = new DaYe("XiMenQing");
    DaYe daYe2 = new DaYe("DuMu");

    LaoBo QinLouNv1 = new LaoBo(new JiaShi());
    LaoBo QinLouNv2 = new LaoBo(new PanJinLian());

    QinLouNv1.happyWithMan(daYe1);
    QinLouNv1.makeEyesWithMan(daYe1);

    System.out.println("----------隔开一间房----------");

    QinLouNv2.happyWithMan(daYe2);
    QinLouNv2.makeEyesWithMan(daYe2);
  }
}
