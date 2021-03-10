package dataConversion;

public class KeywordThis {
	public static void main(String[] args) {
		Student s1 = new Student("Ram");
		s1.setGender(GENDER.MALE);
		System.out.println(s1.getName());
		System.out.println(s1.getGender());
	}

}
