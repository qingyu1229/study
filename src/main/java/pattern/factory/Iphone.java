package pattern.factory;

/**
 * Created by liangqingyu on 2014/11/16.
 */
public class Iphone implements Phone{
    @Override
    public void call() {
        System.out.println("Make a call by Iphone.");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send a message by Iphone.");
    }
}
