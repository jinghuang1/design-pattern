package factory_method;

/**
 * @author jinhuan3
 * @date 2/13/2022 - 11:16 PM
 * 定义女娲
 */
public class NvWa {

  public static void main(String[] args) {
//    System.out.println("-----------造出第一批人：白人-------------");
//    Human whiteHuman = HumanFactory.create(WhiteHuman.class);
//    whiteHuman.laugh();
//    whiteHuman.cry();
//    whiteHuman.talk();
//
//    System.out.println("-----------造出第二批人：黑人-------------");
//    Human blackHuman = HumanFactory.create(BlackHuman.class);
//    blackHuman.laugh();
//    blackHuman.cry();
//    blackHuman.talk();
//
//    System.out.println("-----------造出第三批人：黄人-------------");
//    Human yellowHuman = HumanFactory.create(YellowHuman.class);
//    yellowHuman.laugh();
//    yellowHuman.cry();
//    yellowHuman.talk();

    //女娲累了，随机造人
    for (int i = 0; i < 1000; i++){
      System.out.println("----------随机造人开始------------");
      Human human = HumanFactory.createHuman(Human.class);
      human.laugh();
      human.cry();
      human.cry();
    }
  }
}
