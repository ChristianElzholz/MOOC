import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		Scanner reader = new Scanner(System.in);

		while (true) {

			System.out.println("Type a word: ");
			String word = reader.nextLine();

			if (words.contains(word)) {
				break;
			} else {
				words.add(word);
			}
		}
		System.out.println("You typed the same word twice.");
		reader.close();
	}
}
