import java.util.Scanner;

public class Usernames {
	public static void main(String[] args) {

		String correct_username1 = "alex";
		String correct_username2 = "emily";

		String correct_password1 = "mightyducks";
		String correct_password2 = "cat";

		Scanner reader = new Scanner(System.in);

		System.out.print("Type your username: ");
		String username = reader.nextLine();

		System.out.print("Type your password: ");
		String password = reader.nextLine();

		if ((username.equals(correct_username1) && password.equals(correct_password1))
				|| (username.equals(correct_username2) && password.equals(correct_password2))) {
			System.out.println("You are now logged into the system!");
		} else {
			System.out.println("Your username or password was invalid!");
		}
		reader.close();
	}
}
