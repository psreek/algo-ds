package StockOrderMatching;
import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    List<Order> orders;

    public OrderRepo() {
        this.orders = new ArrayList<>();
        ;
    }

    public void orderCreation(int id, String stock_name, String type, int qty, double price)
    {
      Order order=new Order(id,stock_name,type,qty,price);
       orders.add(order);
    }
    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }


}
