
public class LeastAndGreatest {
	public static int least(int number1, int number2) {
		return Math.min(number1, number2);
	}
	
	public static int greatest(int number1, int number2, int number3) {
		
		if (number1 > number2 && number1 > number3) {
			return number3;
		}
		
		if (number2 > number1 && number2 > number3) {
			return number2;
		}
		
		if (number3 > number1 && number3 > number2) {
			return number3;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int answerForLeast = least(2, 7);
		System.out.println("Least: " + answerForLeast);
		
	    int answerForGreatest =  greatest(2, 7, 3);
	    System.out.println("Greatest: " + answerForGreatest);
	}
}
