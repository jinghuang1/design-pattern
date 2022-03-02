package chain_of_responsibility;

/**
 * @author jinhuan3
 * @date 3/1/2022 - 10:34 PM
 * 父系社会，那就是男性有至高权力,handler控制权
 */
public interface IHandler {

  //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
  public void HandleMessage(IWomen women);
}
