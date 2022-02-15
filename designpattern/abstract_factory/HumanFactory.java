package abstract_factory;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:19 PM
 * 这次定义一个接口，应该要造不同性别的人，需要不同的生产线
 * 那这个八卦炉必须能够制造男人和女人
 */
public interface HumanFactory {

  //制造黄色人类
  public Human createYellowHuman();

  //制造白色人类
  public Human createWhiteHuman();

  //制造黑色人类
  public Human createBlackHuman();

}
