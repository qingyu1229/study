package pattern.factory;

/**
 * Created by liangqingyu on 2014/11/16.
 */
public class PhoneFactory {
    /**
     * 使用单例模式创建Factory
     */
    private static PhoneFactory factory=new PhoneFactory();
    private PhoneFactory(){};
    public static PhoneFactory getInstance(){
        return factory;
    }

    public Phone getPhone(String phoneName){
        Phone phone=null;
        if(phoneName==null){
            return null;
        }
        if(phoneName.equals("Iphone")){
            phone=new Iphone();
        }else if(phoneName.equals("SamsungPhone")){
            phone=new SamsungPhone();
        }else if(phoneName.equals("XiaomiPhone")){
            phone=new Iphone();
        }
        return phone;
    }

}
