package strategy;

import strategy.IStrategyImpl.BackDoor;
import strategy.IStrategyImpl.BlockEnemy;
import strategy.IStrategyImpl.GivenGreenLight;

/**
 * @author jinhuan3
 * @date 2/11/2022 - 3:34 PM
 */
public class ZhaoYun {

  public static void main(String[] args) {
    Context context;

    System.out.println("-----------执行策略1------------");
    context = new Context(new BackDoor());  //拿到妙计1（策略）
    context.operate();

    System.out.println("-----------执行策略2------------");
    context = new Context(new GivenGreenLight());  //拿到妙计2（策略）
    context.operate();

    System.out.println("-----------执行策略3------------");
    context = new Context(new BlockEnemy());  //拿到妙计2（策略）
    context.operate();
  }
}
