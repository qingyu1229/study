package pattern.proxy;

/**
 * Created by liangqingyu on 2014/12/5.
 */
public class ProxySeller implements TicketSeller {
    private String customerInfo;
    private RailwayCompany rc;

    public ProxySeller(String customerInfo){
        this.customerInfo=customerInfo;
    }

    @Override
    public void sellTicket() {
        if(rc==null){
            rc=new RailwayCompany(customerInfo);
        }
        rc.sellTicket();
    }
}
