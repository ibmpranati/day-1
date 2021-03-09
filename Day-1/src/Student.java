
public class Student extends Human {
	
	
	
	void study() {
		System.out.println(getName()+" is studying.");
	}
	
	Student(){				//Default Constructor
		
	}
	Student(String name){	//Custom constructor
		setName(name);
	}


}
