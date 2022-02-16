package facade;

/**
 * @author jinhuan3
 * @date 2/16/2022 - 9:58 PM
 */
public class ModenPostOffice {

  private LetterProcess letterProcess = new LetterProcessImpl();

  private Police letterPolice = new Police();

  //写信，封装，投递，一体化
  public void sendLetter(String context,String address){

    //帮你写信
    letterProcess.writeContext(context);

    //写好信封
    letterProcess.fillEnvelope(address);

    //警察要查看信件
    letterPolice.checkLetter(letterProcess);

    //把信放到信封中
    letterProcess.letterIntoEnvelope();

    //邮递信件
    letterProcess.sendLetter();
  }
}
