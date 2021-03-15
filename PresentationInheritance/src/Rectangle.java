
public class Rectangle extends Quadrilateral {
	private int height;
	Rectangle(int length, int breadth, int height){
		super(length, breadth);
		this.height = height;
	}
	
	public void volume() {
		int volume1 = getLength() * getBreadth() * height;
		System.out.println("Volume : "+ volume1);
	}
	
	@Override
	public void display() {
		System.out.println("In child class.");
	}
}
