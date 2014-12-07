package pattern.proxy;

/**
 * Created by liangqingyu on 2014/12/5.
 */
public class RailwayCompany implements TicketSeller {

    private String customerInfo;
    public RailwayCompany(String customerInfo){
         this.customerInfo=customerInfo;
    }

    @Override
    public void sellTicket() {
        System.out.println("铁路公司出售一张票给"+customerInfo);
    }
}
