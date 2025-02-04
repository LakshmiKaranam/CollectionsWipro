package collect;
import java.util.*;
public class ArrayListQ1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();

        // Step 2: Add five integer elements to the list
        nums.add(34);
        nums.add(2);
        nums.add(32);
        nums.add(44);
        nums.add(87);

        System.out.println(nums);

        nums.remove(2);
        System.out.println("After Removing 3rd Element: " + nums);

        nums.set(1, 100); //updating 1 st indexed element with a new value 100
        System.out.println("After Updating 2nd Element: " + nums);
        for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		

	}

}


