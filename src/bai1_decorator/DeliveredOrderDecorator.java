package bai1_decorator;

public class DeliveredOrderDecorator extends OrderDecorator {
    public DeliveredOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public void handleOrder() {
        super.handleOrder();  // Gọi phương thức của đối tượng gốc
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
