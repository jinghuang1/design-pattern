package abstract_factory;

import abstract_factory.FactoryImpl.MaleHumanFactory;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:34 PM
 * 女娲建立了两条生产线，分别是：
 * 男性生产线
 * 女性生产线
 *
 * 抽象工厂模式，还有一个非常大的有优点，高内聚，低耦合，在一个较大的项目组，
 * 产品是由一批人定义开发的，但是提供其他成员访问的时候，只有工厂方法和产品的接口，
 * 也就是说只需要提供 Product Interface 和 Concrete Factory 就可以产生自己需要的对象和方法，
 * Java 的高内聚低耦合的特性表现的一览无遗。
 */
public class NvWa {

  public static void main(String[] args) {

    //第一条生产线，男性生产线
    HumanFactory maleHumanFactory = new MaleHumanFactory();

    //第二条生产线，男性生产线
    HumanFactory femaleHumanFactory = new MaleHumanFactory();

    //生产线建立完毕，开始生产人
    Human maleYellowHuman = maleHumanFactory.createYellowHuman();

    Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

    maleYellowHuman.cry();
    maleYellowHuman.laugh();
    femaleYellowHuman.sex();

  }
}
