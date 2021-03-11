
public class InnerClassDemo {
	public static void main(String[] args) {
		// array of 10 Account objects
		Account[] accounts = new Account[10];

	}
}

class Account {
//	private Address address;		//composition, can handle single address
	private Address[] addresses; // can handle multiple addresses
	private int number;

	public Account() {
		this.addresses = new Address[3];
	}

	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private class Address {
		private String streetname;
	}
}
