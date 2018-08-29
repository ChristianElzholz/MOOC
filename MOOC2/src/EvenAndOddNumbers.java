import java.util.Scanner;

public class EvenAndOddNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double sum = 0;
		int counter = 0;
		int countOfOddNumbers = 0;
		int countOfEvenNumbers = 0;

		System.out.println("Type a number: ");

		while (true) {
			int number = Integer.parseInt(reader.nextLine());

			if (number == -1) {
				System.out.println("Thank you and see you later!");
				System.out.println("The sum is " + (int) sum);
				System.out.println("How many numbers: " + counter);
				System.out.println("Average " + sum / counter);
				System.out.println("Even numbers: " + countOfEvenNumbers);
				System.out.println("Odd numbers: " + countOfOddNumbers);
				break;
			}

			if (number % 2 == 0) {
				countOfEvenNumbers++;
			} else {
				countOfOddNumbers++;
			}
			counter++;
			sum = sum + number;
		}
		reader.close();
	}
}
