package chain_of_responsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author jinhuan3
 * @date 3/1/2022 - 10:41 PM
 * 我们后人来看这样的社会道德
 */
public class Client {

  public static void main(String[] args) {
    //随机挑选几个女性
    Random random = new Random();
    ArrayList<IWomen> arrayList = new ArrayList<>();
    for (int i = 0; i < 5; i++){
      arrayList.add(new Women(random.nextInt(4),"我要去逛街"));
    }

    //定义三个请示对象
    Handler father = new Father();
    Handler husband = new Husband();
    Handler son = new Son();

    //设置请示顺序
    father.setNext(husband);
    husband.setNext(son);

    for (IWomen women:arrayList){
      father.HandleMessage(women);
    }
  }
}
