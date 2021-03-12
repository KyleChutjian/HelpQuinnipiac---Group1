import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class mainClass {
	private static String whatMeal;
	private static boolean doneLooking = false;
	private static boolean isDayValid = false;
	private static boolean isMealValid = false;
	private static boolean isFinalAnswerValid = false;
	private static int fileInt;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		do {
			do {
				System.out.println(
						"Welcome to Quinnipiac University's Cafe Q! Please enter what day you would like to see the menu for.");
				System.out.println("- Sunday");
				System.out.println("- Monday");
				System.out.println("- Tuesday");
				System.out.println("- Wednesday");
				System.out.println("- Thursday");
				System.out.println("- Friday");
				System.out.println("- Saturday");
				String day = input.nextLine().toLowerCase();
				switch (day) {
					case "monday":
						isDayValid = true;
						do {
							System.out.println("Would you like to see whats for brunch or dinner?");
							whatMeal = input.nextLine().toLowerCase();
							if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
								fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
								isMealValid = true;
							} else {
								System.out.println("You can only enter brunch or dinner, please try again.");
								isMealValid = false;
							}
						} while (!isMealValid);

						break;
					case "tuesday":
						isDayValid = true;
						do {
							System.out.println("Would you like to see whats for brunch or dinner?");
							whatMeal = input.nextLine().toLowerCase();
							if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
								fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
								isMealValid = true;
							} else {
								System.out.println("You can only enter brunch or dinner, please try again.");
								isMealValid = false;
							}
						} while (!isMealValid);

						break;
					case "wednesday":
						isDayValid = true;
						do {
							System.out.println("Would you like to see whats for brunch or dinner?");
							whatMeal = input.nextLine().toLowerCase();
							if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
								fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
								isMealValid = true;
							} else {
								System.out.println("You can only enter brunch or dinner, please try again.");
								isMealValid = false;
							}
						} while (!isMealValid);

						break;
					case "thursday":
						isDayValid = true;
						do {
							System.out.println("Would you like to see whats for brunch or dinner?");
							whatMeal = input.nextLine().toLowerCase();
							if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
								fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
								isMealValid = true;
							} else {
								System.out.println("You can only enter brunch or dinner, please try again.");
								isMealValid = false;
							}
						} while (!isMealValid);

						break;
					case "friday":
						isDayValid = true;
						do {
							System.out.println("Would you like to see whats for brunch or dinner?");
							whatMeal = input.nextLine().toLowerCase();
							if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
								fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
								isMealValid = true;
							} else {
								System.out.println("You can only enter brunch or dinner, please try again.");
								isMealValid = false;
							}
						} while (!isMealValid);

						break;
					case "saturday":
						isDayValid = true;
						do {
							System.out.println("Would you like to see whats for brunch or dinner?");
							whatMeal = input.nextLine().toLowerCase();
							if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
								fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
								isMealValid = true;
							} else {
								System.out.println("You can only enter brunch or dinner, please try again.");
								isMealValid = false;
							}
						} while (!isMealValid);

						break;
					case "sunday":
						isDayValid = true;
						do {
							System.out.println("Would you like to see whats for brunch or dinner?");
							whatMeal = input.nextLine().toLowerCase();
							if (whatMeal.equalsIgnoreCase("brunch") || whatMeal.equalsIgnoreCase("dinner")) {
								fileInt = getMenu(day.toLowerCase(), whatMeal.toLowerCase());
								isMealValid = true;
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
			String dayString = whatMeal(fileInt).substring(0,whatMeal(fileInt).indexOf(":") + 1);
			String meal = whatMeal(fileInt).substring(whatMeal(fileInt).indexOf(":")+1);
			System.out.println(dayString);

			for (int i = 0; i < meal.length(); i++) {
				if (meal.contains(",")) {
					String individualMeal = meal.substring(0,meal.indexOf(","));
					meal = meal.substring(meal.indexOf(",")+1);
					System.out.println("- " + individualMeal);
				}
			}
			do {
				System.out.println("\nWould you like to look at another day?");
				System.out.println("- Yes\n - No");
				String anotherDayAnswer = input.nextLine();
				if (anotherDayAnswer.equalsIgnoreCase("Yes")) {
					isFinalAnswerValid = true;
				} else if (anotherDayAnswer.equalsIgnoreCase("No")) {
					isFinalAnswerValid = true;
					doneLooking = true;
				} else {
					System.out.println("Not a valid response, try again.");
				}
			} while(!isFinalAnswerValid);
		} while (!doneLooking);




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
