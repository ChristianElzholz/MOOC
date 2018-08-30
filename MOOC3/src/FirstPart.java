import java.util.Scanner;

public class FirstPart {
	public static void main(String[] args) {
//		firstPart();
//		endPart();
//		wordInsideWord();
		reverse();
	}

	private static void firstPart() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a word: ");
		String word = reader.nextLine();

		System.out.println("Length of the first part: ");
		int LengthOfFirstPart = Integer.parseInt(reader.nextLine());

		System.out.println(word.substring(0, LengthOfFirstPart));
		reader.close();
	}

	private static void endPart() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a word: ");
		String word = reader.nextLine();

		System.out.println("Length of the end part: ");
		int LengthOfEndPart = Integer.parseInt(reader.nextLine());

		System.out.println(word.substring(word.length() - LengthOfEndPart, word.length()));
		reader.close();
	}

	private static void wordInsideWord() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type the first word: ");
		String word = reader.nextLine();

		System.out.println("Type the second word: ");
		String searchword = reader.nextLine();

		if (word.indexOf(searchword) == -1) {
			System.out.println("the word '" + searchword + "' is not found in the word '" + word + "'");
		} else {
			System.out.println("the word '" + searchword + "' is found in the word '" + word + "'");
		}
		reader.close();
	}

	private static void reverse() {
		String buffer = "";

		Scanner reader = new Scanner(System.in);

		System.out.println("Type a word: ");
		String word = reader.nextLine();
		int counter = word.length() - 1;

		while (counter > 0) {
			buffer = buffer + word.charAt(counter);
			counter--;
		}
		System.out.println(buffer);
	}
}
