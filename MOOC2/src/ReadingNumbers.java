import java.util.Scanner;

public class ReadingNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a number: ");
		
		while (true) {
			int number = Integer.parseInt(reader.nextLine());

			if (number == -1) {
				System.out.println("Thank you and see you later!");
				break;
			}
		}
		reader.close();
	}
}
