
public class School {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	void teacherDiscussion(){
		//for loop 10 teacher
				//System.out.println("Hello");
				for (int i = 0; i < 10; i++) {
					Teacher teacher = new Teacher("Shyam"+i);
				}
				int i = 0;
				while(i<10) {
					System.out.println(i);
					i++;
				}
	}
	void studentDiscussion() {
		Student student = new Student("Ram");
		student.setAge((byte)10);
		//student.setName("");//avoid
//		//student.name = "Ram";	//avoid
		System.out.println("Name = "+student.getName());
		System.out.println("Age = "+student.getAge());
		student.study();		//Ram is studying
	}

}
