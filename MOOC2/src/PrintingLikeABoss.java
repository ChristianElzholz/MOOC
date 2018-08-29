
public class PrintingLikeABoss {
	public static void main(String[] args) {
//		printTriangle(5);
		xmasTree(25);
	}

	private static void printWhitespaces(int size) {
		int counter = 0;
		while (counter < size) {
			System.out.print(" ");
			counter++;
		}
	}

	private static void printStars(int size) {
		int counter = 0;
		while (counter < size) {
			System.out.print("*");
			counter++;
		}
	}

	private static void printTriangle(int size) {
		int counter = 0;
		while (counter < size) {
			printWhitespaces(size - counter - 1);
			printStars(counter + 1);
			System.out.println();
			counter++;
		}
	}

	private static void xmasTree(int height) {
		int counter = 0;
		while (counter < height - 2) {
			printWhitespaces(height - counter - 3);
			printStars(counter);
			printStars(1);
			printStars(counter);
			System.out.println();
			counter++;
		}
		printTreeTrunk(height);
	}

	private static void printTreeTrunk(int height) {
		printWhitespaces(height - 4);
		printStars(3);
		System.out.println();
		printWhitespaces(height - 4);
		printStars(3);
	}
}