package collect;
import java.util.*;

public class HashsetQ2 {

	public static void main(String[] args) {
		 HashSet<String> cities = new HashSet<>();

	        // Step 2: Add five city names (including a duplicate)
	        cities.add("Hyderabad");
	        cities.add("Banglore");
	        cities.add("Vyzag");
	        cities.add("Mysore");
	        cities.add("Vyzag");  // Duplicate entry

	        // Step 3: Display the elements (Duplicates are ignored)
	        System.out.println("Cities in the set: " + cities);

	        // Step 4: Check if a particular city exists (e.g., "Banglore")
	        String cityToCheck = "Banglore";
	        if (cities.contains(cityToCheck)) {
	            System.out.println(cityToCheck + " exists in the set.");
	        } else {
	            System.out.println(cityToCheck + " does not exist in the set.");
	        }

	        // Step 5: Remove a city (e.g., "Mysore") and display the updated set
	        cities.remove("Mysore");
	        System.out.println("Updated set after removing Houston: " + cities);

	}

}


