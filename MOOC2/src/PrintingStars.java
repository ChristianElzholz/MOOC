
public class PrintingStars {
	public static void main(String[] args) {

		printStars(5);
		printStars(3);
		printStars(9);
		System.out.println("--------------");
		printSquare(4);
		System.out.println("--------------");
		printRectangle(7, 4);
		System.out.println("--------------");
		printTriangle(5);
	}

	private static void printStars(int amount) {
		int counter = 0;
		while (counter < amount) {
			System.out.print("*");
			counter++;
		}
		System.out.println();
	}

	private static void printSquare(int sideSize) {
		int counter = 0;
		while (counter < sideSize) {
			printStars(sideSize);
			counter++;
		}
	}

	private static void printRectangle(int width, int height) {
		int counter = 0;

		while (counter < height) {
			printStars(width);
			counter++;
		}
	}

	private static void printTriangle(int size) {
		int counter = 0;

		while (counter < size) {
			printStars(counter + 1);
			counter++;
		}

	}
}
