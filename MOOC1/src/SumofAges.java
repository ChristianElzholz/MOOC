import java.util.Scanner;

public class SumofAges {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Type your name: ");
		String first_name = reader.nextLine();

		System.out.print("Type your age: ");
		int first_age = Integer.parseInt(reader.nextLine());

		System.out.print("Type your name: ");
		String second_name = reader.nextLine();

		System.out.print("Type your age: ");
		int second_age = Integer.parseInt(reader.nextLine());

		int combined_age = first_age + second_age;
		System.out.print(first_name + " and " + second_name + " are " + combined_age + " years old in total.");
		reader.close();
	}
}
