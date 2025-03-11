package bai1_strategy;

public class NewOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng.");
        order.setStrategy(new ProcessingOrderStrategy());  // Chuyển sang chiến lược Đang xử lý
    }
}
