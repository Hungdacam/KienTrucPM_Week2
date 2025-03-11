package bai1_strategy;

public class ProcessingOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đóng gói và vận chuyển.");
        order.setStrategy(new DeliveredOrderStrategy());  // Chuyển sang chiến lược Đã giao
    }
}
