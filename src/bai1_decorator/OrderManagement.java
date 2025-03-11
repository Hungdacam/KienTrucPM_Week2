package bai1_decorator;

public class OrderManagement {
    public static void main(String[] args) {
        // Khởi tạo đơn hàng
        Order order = new Order();

        // Thêm decorator Mới tạo
        Order newOrder = new NewOrderDecorator(order);
        System.out.println("Trạng thái ban đầu của đơn hàng: Mới tạo");
        newOrder.handleOrder();

        // Thêm decorator Đang xử lý
        Order processingOrder = new ProcessingOrderDecorator(newOrder);
        System.out.println("\nTrạng thái sau khi chuyển: Đang xử lý");
        processingOrder.handleOrder();

        // Thêm decorator Đã giao
        Order deliveredOrder = new DeliveredOrderDecorator(processingOrder);
        System.out.println("\nTrạng thái sau khi chuyển: Đã giao");
        deliveredOrder.handleOrder();

        // Giả sử đơn hàng bị hủy
        Order cancelledOrder = new CancelledOrderDecorator(deliveredOrder);
        System.out.println("\nTrạng thái sau khi chuyển: Hủy");
        cancelledOrder.handleOrder();
    }
}
