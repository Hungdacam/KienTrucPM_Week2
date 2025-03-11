package bai1_decorator;

public class NewOrderDecorator extends OrderDecorator {
    public NewOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public void handleOrder() {
        super.handleOrder();  // Gọi phương thức của đối tượng gốc
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}

