package orderManagement;

public class DataWarehouse {
	private int capacity;
	private int category_code;
	private String category_description;
	protected static int flag = 200;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCategory_code() {
		return category_code;
	}

	public void setCategory_code(int category_code) {
		this.category_code = category_code;
	}

	public String getCategory_description() {
		return category_description;
	}

	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}

	public void addToWarehouse(int quantity) {
		flag = flag + quantity;
		System.out.println(quantity + " item(s) successfully added to Warehouse.");
	}

	public void takeFromWarehouse(int quantity) {
		flag = flag - quantity;
		System.out.println(quantity + " item(s) successfully taken away from Warehouse.");
	}

	public void inStock() {
		if (flag == 0)
			System.out.println("Out of stock!");
		else
			System.out.println("In stock.");

	}
}
