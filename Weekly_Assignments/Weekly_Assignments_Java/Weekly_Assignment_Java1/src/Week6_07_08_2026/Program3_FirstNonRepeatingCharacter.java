package Week6_07_08_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program3_FirstNonRepeatingCharacter {

	 public static Character findFirstNonRepeating(String str) {
	        Map<Character, Integer> count = new LinkedHashMap<>();

	        // Count each character
	        for (char ch : str.toCharArray()) {
	            count.put(ch, count.getOrDefault(ch, 0) + 1);
	        }

	        // Find the first character with count 1
	        for (char ch : str.toCharArray()) {
	            if (count.get(ch) == 1) {
	                return ch;
	            }
	        }

	        return null; // No non-repeating character
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
        System.out.println(findFirstNonRepeating(str));
	}

}
