
public class Quadrilateral {
	private int length;
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	private int breadth;
	
	Quadrilateral(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		int area1 = length * breadth;
		System.out.println("Area : " + area1);
	}
	
	public void display() {
		System.out.println("In parent class.");
	}
}
