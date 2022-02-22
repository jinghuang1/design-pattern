package bridge;

import bridge.Product.House;
import bridge.Product.Product;

/**
 * @author jinhuan3
 * @date 2/20/2022 - 10:43 PM
 * 房地产公司，按照翻译来说应该叫realty corp
 */
public class HouseCorp extends Corp{


  public HouseCorp(House house) {
    super(house);
  }

  //房地产赚钱，计算利润
  @Override
  public void makeMoney() {
    super.makeMoney();
    System.out.println("房地产公司赚大钱了...");
  }
}
