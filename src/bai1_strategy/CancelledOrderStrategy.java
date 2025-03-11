package bai1_strategy;

public class CancelledOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}

