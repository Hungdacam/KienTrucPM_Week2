package bai1_decorator;

public abstract class OrderDecorator extends Order {
    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public void handleOrder() {
        this.order.handleOrder();
    }
}
