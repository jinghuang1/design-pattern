package abstract_factory.FactoryImpl;

import abstract_factory.AbstractHumanFactory;
import abstract_factory.Enum.HumanEnum;
import abstract_factory.Human;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:29 PM
 * 女性创建工厂
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

  //创建一个女性黄种人
  @Override
  public Human createYellowHuman() {
    return super.createHuman(HumanEnum.YellowFemaleHuman);
  }

  //创建一个女性白种人
  @Override
  public Human createWhiteHuman() {
    return super.createHuman(HumanEnum.WhiteFemaleHuman);
  }

  //创建一个女性黑种人
  @Override
  public Human createBlackHuman() {
    return super.createHuman(HumanEnum.BlackFemaleHuman);
  }
}
