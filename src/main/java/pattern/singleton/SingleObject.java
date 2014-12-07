package pattern.singleton;

/**
 * Created by liangqingyu on 2014/11/16.
 */
public class SingleObject {

    //创建一个自己的对象
    private static SingleObject instance = new SingleObject();
    //私有化构造函数
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
}
