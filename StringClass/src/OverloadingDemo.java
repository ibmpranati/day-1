import java.util.logging.Logger;

public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.study();
		s1.study(1);
		s1.study(2, "Science");
	}

}

class Student1{
	
//Same method, different number and types of arguments
	public void study(int duration) {
		System.out.println("Study for " + duration + " hours");
		study(duration);
	}
	
	public void study(int duration, String subject) {
		System.out.println("Study " + subject + " for " + duration + " hours");
	}
	public void study() {
		System.out.println("Study");
	}
}
