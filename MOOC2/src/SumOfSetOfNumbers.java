import java.util.Scanner;

public class SumOfSetOfNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int buffer = 1;
		int sumOfNumbers = 0;

		System.out.println("Until what? ");
		int limit = Integer.parseInt(reader.nextLine());

		while (buffer < limit + 1) {
			sumOfNumbers = sumOfNumbers + buffer;
			buffer++;
		}
		System.out.println(sumOfNumbers);
		reader.close();
	}
}