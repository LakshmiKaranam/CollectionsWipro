package collect;
import java.util.*;


public class HashmapQ3 {

	public static void main(String[] args) {
		// Step 1: Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Step 2: Insert five student records
        students.put(101, "Lakshmi");
        students.put(102, "Priya");
        students.put(103, "Jaya");
        students.put(104, "Prasanna");
        students.put(105, "Sravani");

        // Display the HashMap
        System.out.println("Student Records: " + students);

        // Step 3: Retrieve and display a student's name using a specific roll number
        int rollNumberToFind = 103;
        if (students.containsKey(rollNumberToFind)) {
            System.out.println("Student with roll number " + rollNumberToFind + ": " + students.get(rollNumberToFind));
        } else {
            System.out.println("Roll number " + rollNumberToFind + " not found.");
        }

        // Step 4: Remove a student entry using a roll number (e.g., 102)
        int rollNumberToRemove = 102;
        students.remove(rollNumberToRemove);
        System.out.println("Updated Student Records " + rollNumberToRemove + ": " + students);//After removing a RNo.

        // Step 5: Display all student records
        System.out.println("Final Student Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
      

	}

}
}
