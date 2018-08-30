import java.util.ArrayList;

public class SumOfListOfNumbers {
	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		int i = 0;

		while (i < list.size()) {
			sum = sum + list.get(i);
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The sum: " + sum(list));

		list.add(10);

		System.out.println("the sum: " + sum(list));
	}
}
