import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		NumberStatistics allNumbers = new NumberStatistics();
		NumberStatistics oddNumbers = new NumberStatistics();
		NumberStatistics evenNumbers = new NumberStatistics();

		System.out.println("Type numbers: ");

		while (true) {
			int read = Integer.parseInt(reader.nextLine());
			if (read == -1) {
				break;
			} else

			{
				allNumbers.addNumber(read);

				if (read % 2 == 0) {
					oddNumbers.addNumber(read);
				} else {
					evenNumbers.addNumber(read);
				}
			}
		}

		System.out.println("sum: " + allNumbers.sum());
		System.out.println("sum of even: " + evenNumbers.sum());
		System.out.println("sum of odd: " + oddNumbers.sum());

		reader.close();
	}
}
