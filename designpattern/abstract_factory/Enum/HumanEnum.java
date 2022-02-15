package abstract_factory.Enum;

/**
 * @author jinhuan3
 * @date 2/15/2022 - 11:12 PM
 * 世界上有哪些类型的人，列出来
 */
public enum HumanEnum {

  //把世界上所有人类型都定义出来
  YellowMaleHuman("designpattern.abstract_factory.Impl.YellowMaleHuman"),
  YellowFemaleHuman("designpattern.abstract_factory.Impl.YellowFemaleHuman"),
  WhiteMaleHuman("designpattern.abstract_factory.Impl.WhiteMaleHuman"),
  WhiteFemaleHuman("designpattern.abstract_factory.Impl.WhiteFemaleHuman"),
  BlackMaleHuman("designpattern.abstract_factory.Impl.BlackMaleHuman"),
  BlackFemaleHuman("designpattern.abstract_factory.Impl.BlackFemaleHuman");

  private String value = "";

  //定义构造参数，目的是Data(value)类型的相匹配
  private HumanEnum (String value){
    this.value = value;
  }

  public String getValue(){
    return this.value;
  }

}
