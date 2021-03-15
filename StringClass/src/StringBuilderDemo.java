
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("IBM");		//mutable
		sb.append(", Bangalore");
		System.out.println(sb);
		System.out.println(sb.charAt(3));
		System.out.println(sb.indexOf("B"));
		System.out.println(sb.lastIndexOf("B"));
		System.out.println(sb.substring(3));
		
		String str = new String("IBM, Bangalore");
		System.out.println(str == sb.toString());
		String st = str;
		System.out.println(str == st);
		System.out.println(sb.append(str));
	}
}
