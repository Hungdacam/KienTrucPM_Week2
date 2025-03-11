package bai1_decorator;
public class ProcessingOrderDecorator extends OrderDecorator {
    public ProcessingOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public void handleOrder() {
        super.handleOrder();  // Gọi phương thức của đối tượng gốc
        System.out.println("Đóng gói và vận chuyển.");
    }
}
