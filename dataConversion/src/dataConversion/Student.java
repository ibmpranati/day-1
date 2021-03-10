package dataConversion;
class Student extends Human{
	public Student(String name) {
		//name = this.name
		this.name = name;
	}
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void eat() {		//overrides
//		super.eat();
		System.out.println("Student eats.");
	}
}