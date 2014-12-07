package pattern.factory;

/**
 * Created by liangqingyu on 2014/11/16.
 */
public class Test {
    public static void main(String[] args) {
        Phone phone =PhoneFactory.getInstance().getPhone("Iphone");
        phone.call();
        phone.sendMessage();

    }
    }
