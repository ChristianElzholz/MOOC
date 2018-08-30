import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		int i = 0;

		Scanner reader = new Scanner(System.in);

		while (true) {
			System.out.println("Type a word: ");
			String word = reader.nextLine();

			if (word.isEmpty()) {
				break;
			} else {
				words.add(word);
			}
		}
		Collections.sort(words);
		while (i < words.size()) {
			System.out.println(words.get(i));
			i++;
		}
	}
}
