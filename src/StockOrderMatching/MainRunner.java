package StockOrderMatching;

public class MainRunner {
    public static void main(String[] args) {
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.orderCreation(1,"FK","sell",50,137.50);
        orderRepo.orderCreation(2,"AZ","sell",80,154.50);
        System.out.println(orderRepo.toString());
    }

}
