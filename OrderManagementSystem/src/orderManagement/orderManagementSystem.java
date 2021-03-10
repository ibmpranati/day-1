package orderManagement;

public class orderManagementSystem {
	public static void main(String[] args) {
		float total = 0.0f;
		Customer customer1 = new Customer("Pooja", (byte)26, GENDER.FEMALE);
		Order order = new Order();
		
		for (int i = 0; i < 10; i++) {
			Order order1 = new Order("Cello Bottle", 350.0f, 2, STATUS.ORDER_PLACED);
			total = order1.calculateTotal();
		}
		
		order.takeFromWarehouse(2);
		order.inStock();
		System.out.println("Your total expense is " + total);
		customer1.placeOrder();
	}
}
