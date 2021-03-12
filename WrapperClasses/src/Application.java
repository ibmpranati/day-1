import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		int a = 1;
//		a.
		Integer b = a;		//autoboxing, a converted to object automatically
//		b.
		
		Double d = 23.4;
		System.out.println(d.compareTo(33.3));
		double doublePrimitive = d;		//auto unboxing
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(56);			//automatically converted into object
		System.out.println(numbers);
	}
}
