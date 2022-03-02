package chain_of_responsibility;

/**
 * @author jinhuan3
 * @date 3/2/2022 - 10:42 PM
 * 父系社会，那就是男性有至高无上的权力，handler控制权
 */
public abstract class Handler {

  //能处理的级别
  private int level = 0;

  //责任传递，下一个责任人是谁
  private Handler nextHandler;

  //每个类都要说明一下自己能处理哪些请求
  public Handler(int _level){
    this.level = _level;
  }

  //一个女性（女儿，妻子或者母亲）要去逛街，你要处理这个请求
  public final void HandleMessage(IWomen women){
    if(women.getType() == this.level){
      this.response(women);
    }else {
      if(this.nextHandler != null){               //有后续环节，才能把请求往后递送
        this.nextHandler.HandleMessage(women);
      }else {                                     //已经没有后续处理人了，不用处理了
        System.out.println("-------不用请示了，你自由了---------");
      }
    }
  }

  /**
   * 如果你属于你处理的返回，你应该让他找下一个环节的人，比如
   * 女儿出嫁了，还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该请示丈夫
   */
  public void setNext(Handler _handler){
    this.nextHandler = _handler;
  }

  //有请示那当然要回应
  public abstract void response(IWomen women);
}
