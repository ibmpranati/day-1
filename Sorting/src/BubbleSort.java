
public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = { 7, 9, 3, 6 };
		int temp = 0;
		int c = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			c++;
			for (int j = 1; j < numbers.length - i; j++) {
				if (numbers[j - 1] > numbers[j]) {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println(c);
		System.out.println("Array after sorting:");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}
}
