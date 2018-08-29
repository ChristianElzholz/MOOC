import java.util.Scanner;

public class SumBetweenTwoNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sumOfNumbers = 0;

		System.out.println("What is the lower limit? ");
		int lowerLimit = Integer.parseInt(reader.nextLine());

		System.out.println("What is the upper limit? ");
		int upperLimit = Integer.parseInt(reader.nextLine());

		while (lowerLimit < upperLimit + 1) {
			sumOfNumbers = sumOfNumbers + lowerLimit;
			lowerLimit++;
		}
		System.out.println("The sum is " + sumOfNumbers);
		reader.close();
	}
}
