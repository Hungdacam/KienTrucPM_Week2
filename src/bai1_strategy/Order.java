package bai1_strategy;

public class Order {
    private OrderStrategy strategy;

    public Order() {
        // Ban đầu, đơn hàng sẽ có chiến lược Mới tạo
        strategy = new NewOrderStrategy();
    }

    public void setStrategy(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleOrder() {
        strategy.handleOrder(this);
    }
}
