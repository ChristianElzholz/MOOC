import java.util.Scanner;

public class GuessingANumberGame {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int randomNumber = drawNumber();

		while (true) {
			System.out.println("Guess a number: ");
			int guessedNumber = Integer.parseInt(reader.nextLine());

			if (guessedNumber == randomNumber) {
				System.out.println("Congratulations, your guess is correct!");
				break;
			} else if (guessedNumber < randomNumber) {
				System.out.println("The number is greater");
			} else {
				System.out.println("The number is lesser");
			}

		}
		reader.close();
	}
	private static int drawNumber() {
		return (int) (Math.random() * 100);
	}
}
