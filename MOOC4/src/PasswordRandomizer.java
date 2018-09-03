import java.util.Random;

public class PasswordRandomizer {
	private String symbol = "abcdefghijklmnopqrstuvwxyz";
	private int length;

	public PasswordRandomizer(int length) {
		this.length = length;
	}

	public String createPassword() {
		String buffer = "";
		Random random = new Random();

		for (int i = 0; i < this.length; i++) {
			buffer += symbol.charAt(random.nextInt(symbol.length()));
		}
		return buffer;
	}
}
