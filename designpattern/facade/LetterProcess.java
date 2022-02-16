package facade;

/**
 * @author jinhuan3
 * @date 2/16/2022 - 9:59 PM
 * 定义一个写信的过程
 */
public interface LetterProcess {

  public void writeContext(String context);

  public void fillEnvelope(String address);

  public void letterIntoEnvelope();

  public void sendLetter();

}
