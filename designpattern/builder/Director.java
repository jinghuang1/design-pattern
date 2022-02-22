package builder;

import java.util.ArrayList;

/**
 * @author jinhuan3
 * @date 2/19/2022 - 11:24 PM
 * 导演安排顺序，生产车辆模型
 */
public class Director {

  private ArrayList<String> sequence = new ArrayList<>();

  private BenzBuilder benzBuilder = new BenzBuilder();

  private BMWBuilder bmwBuilder = new BMWBuilder();

  /**
   * A类型的奔驰车模型，先start,然后stop,其他什么引擎，喇叭都没有
   */
  public BenzModel getABenzModel(){
    //清理场景，这里是一些初级程序yuan不注意的地方
    this.sequence.clear();

    //这个ABenModel的执行顺序
    this.sequence.add("start");
    this.sequence.add("stop");

    //按照顺序返回一个奔驰车
    this.benzBuilder.setSequence(this.sequence);
    return (BenzModel) this.benzBuilder.getCarModel();
  }

  /**
   * B类型的奔驰模型，是先发动引擎，然后启动，然后停止，没有喇叭
   */
  public BenzModel getBBenzModel(){
    //清理场景，这里是一些初级程序yuan不注意的地方
    this.sequence.clear();

    //这个BBenModel的执行顺序
    this.sequence.add("engine boom");
    this.sequence.add("start");
    this.sequence.add("stop");

    //按照顺序返回一个奔驰车
    this.benzBuilder.setSequence(this.sequence);
    return (BenzModel) this.benzBuilder.getCarModel();
  }

  /**
   * C类型的宝马模型，是喇叭，然后启动，然后停止
   */
  public BMWModel getCBWMModel(){
    //清理场景，这里是一些初级程序yuan不注意的地方
    this.sequence.clear();

    //这个CBMWModel的执行顺序
    this.sequence.add("alarm");
    this.sequence.add("start");
    this.sequence.add("stop");

    //按照顺序返回一个奔驰车
    this.bmwBuilder.setSequence(this.sequence);
    return (BMWModel) this.bmwBuilder.getCarModel();
  }

  /**
   * D类型的宝马模型，是喇叭，然后启动，然后停止
   */
  public BMWModel getDBWMModel(){
    //清理场景，这里是一些初级程序yuan不注意的地方
    this.sequence.clear();

    //这个DBMWModel的执行顺序
    this.sequence.add("start");

    //按照顺序返回一个奔驰车
    this.bmwBuilder.setSequence(this.sequence);
    return (BMWModel) this.bmwBuilder.getCarModel();
  }

  /**
   * 这里还可以有很多方法，你可以先停止，然后启动，或者一直停止不动
   * 按照什么顺序是导演说的算
   */
}
