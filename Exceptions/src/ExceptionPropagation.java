
public class ExceptionPropagation {
	public static void main(String[] args) {
		new A().m1();
	}
}

class A{
	void m1() {
		try {
		m2();
		}catch (RuntimeException runtimeException) {
			runtimeException.printStackTrace();
			System.out.println("handled");
		}catch(Exception exception) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("Always");
		}
		System.out.println("m1");
	}
	
	void m2() throws Exception {
		System.out.println("m2");
		throw new Exception();
//		throw new RuntimeException();
	}
}
