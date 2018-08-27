import java.util.Scanner;

public class Passwords {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String password = "carrot";

		while (true) {
			System.out.print("Type the password: ");
			String input = reader.nextLine();

			if (input.equals(password)) {
				System.out.println("Right");
				System.out.println("");
				System.out.println("The secret is: jryy qbar!");
				break;
			} else {
				System.out.println("Wrong!");
			}
		}
		reader.close();
	}
}
