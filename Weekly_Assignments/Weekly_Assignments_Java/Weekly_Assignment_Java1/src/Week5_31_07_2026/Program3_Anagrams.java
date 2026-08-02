package Week5_31_07_2026;

import java.util.Arrays;

public class Program3_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="listen";
		String str2="slient";
		str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
	}

}
