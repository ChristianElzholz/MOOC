import java.util.Scanner;

public class PrintingOutText {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int counter = 0;

		System.out.println("How many?");
		int number = Integer.parseInt(reader.nextLine());

		while (counter < number) {
			printText();
			counter++;
		}
		reader.close();
	}

	public static void printText() {
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
}
