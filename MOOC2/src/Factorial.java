import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int counter = 2;
		int factorial = 1;

		System.out.println("Type a number: ");
		int number = Integer.parseInt(reader.nextLine());

		if (number < 0) {
			System.out.println("Number must be above zero!");
		} else if (number == 0 || number == 1) {
			System.out.println("The factorial is 1");
		} else
			while (counter < number + 1) {
				factorial = factorial * counter;
				counter++;
			}
		System.out.println(factorial);
		reader.close();
	}
}
