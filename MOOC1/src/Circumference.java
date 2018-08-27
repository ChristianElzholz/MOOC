import java.util.Scanner;

public class Circumference {
	public static void main(String[] args) {
		// circumference formula: 2 * pi * radius

		Scanner reader = new Scanner(System.in);

		System.out.print("Type the radius: ");
		int radius = Integer.parseInt(reader.nextLine());

		double circumference = (double) 2 * Math.PI * radius;

		System.out.println("Circumference of the circle: " + circumference);
		reader.close();
	}
}
