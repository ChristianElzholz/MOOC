import java.util.ArrayList;

public class Variance {
	public static double variance(ArrayList<Integer> list) {

		double avg = average(list);
		double sum = 0;
		int i = 0;

		while (i < list.size()) {
			sum = sum + Math.pow(list.get(i) - avg, 2);
			i++;
		}
		return sum / (list.size() - 1);
	}

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

		System.out.println("The variance is: " + variance(list));
	}

}
