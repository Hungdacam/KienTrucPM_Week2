package bai1_state;

public class CancelledOrderState implements OrderState {

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		 System.out.println("Hủy đơn hàng và hoàn tiền.");
	}

}
