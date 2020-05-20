package StockOrderMatching;

public class MainRunner {
    public static void main(String[] args) {
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.orderCreation(1,"FK","sell",50,137.50);
        orderRepo.orderCreation(2,"AZ","sell",80,154.50);
        System.out.println(orderRepo.toString());
        orderRepo.requestForBuy(3,"FK","buy",30,137.50);
        System.out.println(orderRepo.toString());
        BuyOrder by= new BuyOrder();
        by.matchingsellOrder();
        System.out.println(by.toString());
    }

}
