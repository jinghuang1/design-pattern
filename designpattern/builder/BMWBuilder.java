package builder;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 11:18 PM
 */
public class BMWBuilder extends CarBuilder{

  private BMWModel bmw = new BMWModel();

  @Override
  public void setSequence(ArrayList<String> sequence) {
    this.bmw.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.bmw;
  }
}
