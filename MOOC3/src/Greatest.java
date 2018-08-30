import java.util.ArrayList;

public class Greatest {
	public static int greatest(ArrayList<Integer> list) {
		int i = 0;
		int result = 0;

		while (i < list.size()) {
			if (list.get(i) > result) {
				result = list.get(i);
			}
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The greatest number is: " + greatest(list));
	}
}
