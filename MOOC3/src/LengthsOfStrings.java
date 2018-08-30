import java.util.ArrayList;

public class LengthsOfStrings {
	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		int i = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();

		while (i < list.size()) {
			result.add(list.get(i).length());
			i++;
		}
		return result;

	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hallo");
		list.add("Moi");
		list.add("Benvenuto!");
		list.add("badger badger badger badger");
		
		ArrayList<Integer> lengths = lengths(list);

		System.out.println("The lengths of the Strings: " + lengths);
	}

}
