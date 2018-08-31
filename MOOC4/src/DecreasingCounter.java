public class DecreasingCounter {
	private int value;
	private int intial;

	public DecreasingCounter(int valueAtStart) {
		this.value = valueAtStart;
		this.intial = valueAtStart;
	}

	public void printValue() {
		System.out.println("value: " + this.value);
	}

	public void decrease() {

		if (this.value > 0) {
			this.value = this.value - 1;
		}
	}

	public void reset() {
		this.value = 0;
	}

	public void setInitial() {
		this.value = this.intial;
	}
}