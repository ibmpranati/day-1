
public class FinalKeyword {
	public static void main(String[] args) {
		Parent child = new Child();
		child.m1();
	}
}

class Parent{
	final String name = "Pranati";
	void m1() {		//cannot be overriden
		System.out.println("Parent");
	}
	
	void m2() {
		
	}
}

class Child extends Parent{
	void m1() {		//override
		System.out.println("Child");
	}
	
	@Override
	void m2() {
		
	}
}

// class MyString extends String{		// not allowed
//}