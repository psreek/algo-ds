package StockOrderMatching;
import java.time.LocalDateTime;




public class Order {
    int id;
    LocalDateTime time;
    String stock_name;
    String type;
    int qty;
    double price;
    public Order(int id,String stock_name, String type, int qty, double price) {
        this.id = id;
        this.time = LocalDateTime.now();
        this.stock_name = stock_name;
        this.type = type;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "order{" +
                "id='" + id +
                ", time='" + time + '\'' +
                ", stockname=" + stock_name +
                ", type = "+type +
                ", qty = "+qty+
                ", price = "+price +
                '}';
    }


}
