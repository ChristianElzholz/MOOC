import java.util.ArrayList;

public class Menu {

	private ArrayList<String> meals;

	public Menu() {
		this.meals = new ArrayList<String>();
	}

	public void addMeal(String meal) {
		meals.add(meal);
	}

	public void printMeals() {

		if (meals.isEmpty()) {
			System.out.println("There is nothing on the menu!");
		}

		for (String string : meals) {
			System.out.println(string);
		}
	}

	public void clearMenu() {
		meals.removeAll(meals);
	}
}
