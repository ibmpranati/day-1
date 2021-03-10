package orderManagement;

public class Order extends DataWarehouse {
	private String name;
	private float price;
	private int quantity;
	private STATUS status;
	
	public Order(String name, float price, int quantity, STATUS status) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
	}
	
	public Order() {
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public STATUS getStatus() {
		return status;
	}
	
	public void setStatus(STATUS status) {
		this.status = status;
	}
	
	public float calculateTotal() {
		float total = price * quantity;
		return total;
	}
	
	public void checkStatus() {
		if (status == STATUS.ORDER_PLACED) {
			System.out.println("Order is placed.");
		}
		else if (status == STATUS.DISPATCHED) {
			System.out.println("Order is dispatched.");
		}
		else if (status == STATUS.PACKED) {
			System.out.println("Order is packed.");
		}
		else if (status == STATUS.SHIPPED) {
			System.out.println("Order is shipped.");
		}
		else if (status == STATUS.DELIVERED) {
			System.out.println("Order is delivered.");
		}
		else{
			System.out.println("Invalid Request.");
		}
	}
}
