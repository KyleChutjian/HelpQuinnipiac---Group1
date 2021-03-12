import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class mainClass {
	private static String whatMeal;
	private static boolean isDayValid = false;
	private static boolean isMealValid = false;
	private static int fileInt;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		do {
			System.out.println(
					"Welcome to Quinnipiac University's Cafe Q! Please enter what day you would like to see the menu for.");
			String day = input.nextLine().toLowerCase();
			switch (day) {
			case "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday":
				isDayValid = true;
				do {
					System.out.println("Would you like to see whats for brunch or dinner?");
					whatMeal = input.nextLine().toLowerCase();
					if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
						fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
						isMealValid = true;
						System.out.println(whatMeal(fileInt));
					} else {
						System.out.println("You can only enter brunch or dinner, please try again.");
						isMealValid = false;
					}
				} while (!isMealValid);

				break;

			default:
				System.out.println("You can only enter days of the week, try again.");
				isDayValid = false;
				break;
			}

		} while (!isDayValid);

		System.out.println("User chose " + fileInt);
	}

	public static int getMenu(String day, String meal) {
		if (day.equalsIgnoreCase("monday") && meal.equalsIgnoreCase("brunch")) {
			return 1;
		} else if (day.equalsIgnoreCase("monday") && meal.equalsIgnoreCase("dinner")) {
			return 2;
		} else if (day.equalsIgnoreCase("tuesday") && meal.equalsIgnoreCase("brunch")) {
			return 3;
		} else if (day.equalsIgnoreCase("tuesday") && meal.equalsIgnoreCase("dinner")) {
			return 4;
		} else if (day.equalsIgnoreCase("wednesday") && meal.equalsIgnoreCase("brunch")) {
			return 5;
		} else if (day.equalsIgnoreCase("wednesday") && meal.equalsIgnoreCase("dinner")) {
			return 6;
		} else if (day.equalsIgnoreCase("thursday") && meal.equalsIgnoreCase("brunch")) {
			return 7;
		} else if (day.equalsIgnoreCase("thursday") && meal.equalsIgnoreCase("dinner")) {
			return 8;
		} else if (day.equalsIgnoreCase("friday") && meal.equalsIgnoreCase("brunch")) {
			return 9;
		} else if (day.equalsIgnoreCase("friday") && meal.equalsIgnoreCase("dinner")) {
			return 10;
		} else if (day.equalsIgnoreCase("saturday") && meal.equalsIgnoreCase("brunch")) {
			return 11;
		} else if (day.equalsIgnoreCase("saturday") && meal.equalsIgnoreCase("dinner")) {
			return 12;
		} else if (day.equalsIgnoreCase("sunday") && meal.equalsIgnoreCase("brunch")) {
			return 13;
		} else if (day.equalsIgnoreCase("sunday") && meal.equalsIgnoreCase("dinner")) {
			return 14;
		} else {
			return 15;
		}
	}

	public static String whatMeal(int mealPicked) {
		boolean istrue = true;
		String nameMeal = null;
		File allMealsList = new File("src/mealList");
		Scanner fileinput;
		Scanner userInput = new Scanner(System.in);
		try {
			fileinput = new Scanner(allMealsList);

			for (int i = 0; i < mealPicked; i++) {
				nameMeal = fileinput.nextLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("the file you are looking for is not here:(");
		}

		return nameMeal;
	}

}
