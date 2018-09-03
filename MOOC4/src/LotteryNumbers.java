import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
	private ArrayList<Integer> numbers;

	public LotteryNumbers() {
		this.numbers = new ArrayList<Integer>();
		Random random = new Random();
		int bound = 38;

		for (int i = 0; i < 7; i++) {
			numbers.add(random.nextInt(bound) + 1);
		}
		this.drawNumbers();
	}

	public ArrayList<Integer> numbers() {
		return this.numbers;
	}

	public void drawNumbers() {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(i + ". " + numbers.get(i));
		}
	}

	public boolean containsNumber(int number) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == number) {
				return true;
			}
		}
		return false;
	}
}