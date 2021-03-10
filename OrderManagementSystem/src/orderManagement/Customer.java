package orderManagement;

public class Customer{
	
	private String name;
	private byte age;
	private GENDER gender;
	private long contactnumber;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Please Enter Name");
		}
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	public Customer(String name, byte age, GENDER gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Customer() {
	}

	void placeOrder() {
		System.out.println("Thank you "+ getName()+ " for placing the order.");	
	}
}
