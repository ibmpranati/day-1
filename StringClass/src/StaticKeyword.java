import java.util.logging.Logger;

public class StaticKeyword {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s2.setCount(1);
		System.out.println(s1.getCount());
		System.out.println(s2.getCount());
		Student.study();
		s1.study();	//avoid
	}
}

class Student{
	private static int count;
	
	static Logger logger = Logger.getLogger(Student.class.toString());

	public int getCount() {
		logger.warning("Warning");
		logger.severe("Fine");		
		return count;
	}

	public void setCount(int count) {
		Student.count = count;
	}
	
	public static void study() {
		System.out.println("Study");
	}
}

