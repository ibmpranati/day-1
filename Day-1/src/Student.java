
public class Student extends Human {
	
	
	
	void study() {
		super.studyH();
		System.out.println(getName()+" is studying.");
	}
	
	Student(){				//Default Constructor
		
	}
	Student(String name){	//Custom constructor
		setName(name);
	}


}
