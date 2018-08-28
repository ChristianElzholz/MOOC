import java.util.Scanner;

public class LowerLimitAndUpperLimit {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("What is the lower limit? ");
		int lowerLimit = Integer.parseInt(reader.nextLine());

		System.out.println("What is the upper limit? ");
		int upperLimit = Integer.parseInt(reader.nextLine());

		if (upperLimit < lowerLimit) {
			System.out.println("NOPE.");
		}
		System.out.println("Commence counting!");
		while (lowerLimit < upperLimit+1) {
			System.out.println(lowerLimit);
			lowerLimit++;
		}
		reader.close();
	}
}
