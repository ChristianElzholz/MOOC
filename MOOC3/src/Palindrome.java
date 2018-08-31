import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(String text) {
		String help = reverse(text);

		if (text.equals(help)) {
			return true;
		} else {
			return false;
		}
	}

	private static String reverse(String text) {
		String buffer = "";

		for (int i = 0; i < text.length(); i++) {
			buffer = buffer + text.charAt(i);
		}
		return buffer;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a text: ");
		String text = reader.nextLine();
		if (palindrome(text)) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
	}
}
