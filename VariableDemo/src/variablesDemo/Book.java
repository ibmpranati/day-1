package variablesDemo;

public class Book {
	int a = 0;		//instance variable
	void m() {
		int a = 10;			//local
		int b = 20;
		System.out.println(a);
//		System.out.println(this.a);
		if(a == 10) {
			b = 20;			//block level
		}
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.m();
	}
}
