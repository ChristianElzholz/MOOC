import java.util.Scanner;

public class LengthOfAName {

	public static int calculateCharacters(String text) {
		return text.length();
	}

	static char firstCharacter(String text) {
		return text.charAt(0);
	}

	public static char lastCharacter(String text) {
		return text.charAt(text.length() - 1);
	}

	public static void firstThreeCharacters(String text) {
		int counter = 0;

		if (text.length() < 3) {
			System.out.println("Your name is not long enough.");
		} else {
			while (counter < 3) {
				System.out.println((counter + 1) + ". character: " + text.charAt(counter));
				counter++;
			}
		}
	}

	public static void separatingCharacters(String text) {

		int counter = 0;

		while (counter < text.length()) {
			System.out.println((counter + 1) + ". character: " + text.charAt(counter));
			counter++;
		}

	}

//	public static String reverseName(String text) {
//
//		String reverseText = "";
//		String buffer = text;
//
//		int reversecounter = text.length() - 1;
//
//		while (reversecounter > 1) {
//			reverseText = reverseText + buffer.substring(buffer.length() - 2, buffer.length() - 1);
//			buffer = buffer.substring(0, buffer.length() - 2);
//			reversecounter--;
//		}
//		return reverseText;
//	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Type Your name:");
		String nameOfTheUser = reader.nextLine();

		System.out.println("Number of characters: " + calculateCharacters(nameOfTheUser));

		System.out.println("First character: " + firstCharacter(nameOfTheUser));

		System.out.println("Last character: " + lastCharacter(nameOfTheUser));

		separatingCharacters(nameOfTheUser);

//		System.out.println("Reverse: " + reverseName(nameOfTheUser));

		reader.close();
	}

}
