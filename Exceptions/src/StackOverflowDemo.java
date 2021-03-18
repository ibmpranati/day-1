
public class StackOverflowDemo {
	public static void main(String[] args) {
		callMe();
	}

	private static void callMe() {
		callMe();
		System.out.println("Called");
	}
}
