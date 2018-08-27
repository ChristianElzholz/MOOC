
public class Seconds_in_one_year {
	public static void main(String[] args) {
		int days_per_year = 365;
		int hours_per_day = 24;
		int minutes_per_hour = 60;
		int seconds_per_minute = 60;

		int seconds_per_year = days_per_year * hours_per_day * minutes_per_hour * seconds_per_minute;

		System.out.println("There are " + seconds_per_year + " seconds in a year.");
	}
}
