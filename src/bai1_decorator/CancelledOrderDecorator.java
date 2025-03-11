package bai1_decorator;

public class CancelledOrderDecorator extends OrderDecorator {
    public CancelledOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public void handleOrder() {
        super.handleOrder();  // Gọi phương thức của đối tượng gốc
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}

