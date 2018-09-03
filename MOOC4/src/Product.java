
public class Product {
	private double price;
	private int amount;
	private String name;

	public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
		this.price = priceAtStart;
		this.amount = amountAtStart;
		this.name = nameAtStart;
	}

	public void print() {
		System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
	}

	public static void main(String[] args) {

		Product banana = new Product("banana", 1.1, 13);

		banana.print();
	}
}
