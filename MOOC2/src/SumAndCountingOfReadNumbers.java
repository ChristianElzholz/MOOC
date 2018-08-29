import java.util.Scanner;

public class SumAndCountingOfReadNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int sum = 0;
		int counter = 0;

		System.out.println("Type a number: ");

		while (true) {
			int number = Integer.parseInt(reader.nextLine());
			sum = sum + number;

			if (number == -1) {
				System.out.println("Thank you and see you later!");
				System.out.println("The sum is " + sum);
				System.out.println("How many numbers: " + counter);
				break;
			}
			counter++;
		}
		reader.close();
	}
}
