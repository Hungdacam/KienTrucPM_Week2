package bai1_strategy;

public class DeliveredOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}