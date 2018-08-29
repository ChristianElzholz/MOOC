import java.util.Scanner;

public class SumOfPowers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int counter = 0;
		int sum = 0;

		System.out.println("Type a number: ");
		int limit = Integer.parseInt(reader.nextLine());

		while (counter < limit + 1) {
			sum = (int) (sum + Math.pow(2, counter));
			counter++;
		}
		System.out.println("The result is " + sum);
		reader.close();
	}
}
