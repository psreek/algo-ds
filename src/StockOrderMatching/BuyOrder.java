package StockOrderMatching;
import java.util.ArrayList;
import java.util.List;

public class BuyOrder extends OrderRepo {

    List<Order> sell;
    List<Order> buy;



    public BuyOrder() {
        this.sell = new ArrayList<>();
        this.buy= new ArrayList<>();

    }

    public void matchingsellOrder()
{
    super.getOrders();
//    System.out.println(super.getOrders().size());
    for (int i=0; i<getOrders().size();i++)
    {
        if(getOrders().get(i).type == "buy" )
            buy.add(getOrders().get(i));
    }
    for (int i=0;i<getOrders().size();i++)
    {
        if(getOrders().get(i).type == "sell"){
            sell.add(getOrders().get(i));
        }

    }

}
    @Override
    public String toString() {
        return "OrderRepo{" +
                "buyorders=" + buy +
                "seller="+sell+'}';
    }

}
