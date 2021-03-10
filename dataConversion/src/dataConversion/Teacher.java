package dataConversion;

public class Teacher extends Human {
	private String name;
	private float salary;
	private String subject;
	
	public Teacher(String string) {
		setName(name);
	}

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
