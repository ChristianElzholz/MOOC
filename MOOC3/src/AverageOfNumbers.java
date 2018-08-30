import java.util.ArrayList;

public class AverageOfNumbers {
	public static double average(ArrayList<Integer> list) {
		double sum = 0;
		int i = 0;

		while (i < list.size()) {
			sum = sum + list.get(i);
			i++;
		}

		return sum / list.size();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The average is: " + average(list));
	}

}
