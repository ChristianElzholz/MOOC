import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Type a number: ");
		int a = Integer.parseInt(reader.nextLine());

		System.out.print("Type another number: ");
		int b = Integer.parseInt(reader.nextLine());

		System.out.println("The bigger number is: " + Math.max(a, b));
		reader.close();
	}
}
