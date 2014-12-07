package pattern.proxy;

/**
 * Created by liangqingyu on 2014/12/5.
 */
public class Test {
    public static void main(String[] args) {
        String customerInfo="张三丰";
        ProxySeller ps=new ProxySeller(customerInfo);
        ps.sellTicket();
    }
}
