import java.util.Scanner;

public class UpToCertainNumber {

	public static void main(String[] args) {
		int counter = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Up to which number? ");
		int certainNumber = Integer.parseInt(reader.nextLine());

		while (counter < certainNumber) {
			counter++;
			System.out.println(counter);
		}
		reader.close();
	}
}
