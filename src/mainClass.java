import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mainClass {
	private static String whatMeal;
	private static boolean isTrue = true;
    	 public static void main(String[] args) {
    	    	System.out.println("Welcome to Quinnipiac University's Cafe Q! Please enter what day you would like to see the menu for.");
    	    	Scanner input = new Scanner(System.in);
    	    	String day = input.nextLine();
    	    	
    	    	
    	    	while(isTrue) {
    	    	switch(day.toLowerCase()) {
    	    	case "monday": 
    	    		System.out.println("Would you like to see whats for lunch or dinner?");
    	    		whatMeal = input.nextLine();
    	    		System.out.println(whatMeal(1));
    	    		
    	    		break;
    	    	case "tuesday":	
    	    		System.out.println("Would you like to see whats for lunch or dinner?");
    	    		whatMeal = input.nextLine();
    	    		
    	    		break;
    	    	case "wednesday":
    	    		System.out.println("Would you like to see whats for lunch or dinner?");
    	    		whatMeal = input.nextLine();
    	    		
    	    		break;
    	    	case "thursday":
    	    		System.out.println("Would you like to see whats for lunch or dinner?");
    	    		whatMeal = input.nextLine();
    	    		
    	    		break;
    	    	case "friday":
    	    		System.out.println("Would you like to see whats for lunch or dinner?");
    	    		whatMeal = input.nextLine();
    	    		
    	    		break;
    	    	case "saturday":
    	    		System.out.println("Would you like to see whats for lunch or dinner?");
    	    		whatMeal = input.nextLine();
    	    		
    	    		break;
    	    	case "sunday":
    	    		System.out.println("Would you like to see whats for lunch or dinner?");
    	    		whatMeal = input.nextLine();
    	    		
    	    		break;
    	    	default:
    	    		isTrue = true;
    	    		break;
    	    		
    	    	
    	    	}
    	    	
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
    			
    			
    			for(int i = 0; i < mealPicked; i++) {
    				nameMeal = fileinput.nextLine();
    			}
    		
    			 
    			 
    		 } catch(FileNotFoundException e) {
    			 e.printStackTrace();
    			 System.out.println("the file you are looking for is not here:(");
    		 }
    		 
    		 
    		 
    		 return nameMeal;
    	 }

}
