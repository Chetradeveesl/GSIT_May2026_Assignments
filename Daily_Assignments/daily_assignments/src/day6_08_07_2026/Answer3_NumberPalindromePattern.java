package day6_08_07_2026;

public class Answer3_NumberPalindromePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int rows = 5;

	        for (int i = 1; i <= rows; i++) {

	            // Print leading spaces
	            for (int j = i; j < rows; j++) {
	                System.out.print("  ");
	            }

	            // Print increasing numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }

	            // Print decreasing numbers
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }

	            System.out.println();
	        }
	}

}
