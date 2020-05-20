package StockOrderMatching;

import java.time.LocalDateTime;
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
    public void requestForBuy(int id, String stock_name, String type, int qty, double price)
    {
       try {
           System.out.println(getOrders().get(0).time);
               if ((LocalDateTime.now().compareTo(getOrders().get(0).time)) > 0) {
                   Order order = new Order(id, stock_name, type, qty, price);
                   orders.add(order);
               }

       } catch (Exception e) {
           System.out.println("no sell order found");
       }

    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }
    public List<Order> getOrders() {
        return orders;
    }


}
