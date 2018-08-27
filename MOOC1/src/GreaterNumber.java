import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Type a number: ");
		int first_number = Integer.parseInt(reader.nextLine());

		System.out.print("Type another number: ");
		int second_number = Integer.parseInt(reader.nextLine());

		if (first_number == second_number) {
			System.out.println("The numbers are equal!");
		} else {
			System.out.println("Greater number: " + Math.max(first_number, second_number));
		}
		reader.close();
	}
}
