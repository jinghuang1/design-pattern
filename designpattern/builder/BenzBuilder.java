package builder;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 11:17 PM
 */
public class BenzBuilder extends CarBuilder{
  private BenzModel benz = new BenzModel();

  @Override
  public void setSequence(ArrayList<String> sequence) {
    this.benz.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.benz;
  }
}
