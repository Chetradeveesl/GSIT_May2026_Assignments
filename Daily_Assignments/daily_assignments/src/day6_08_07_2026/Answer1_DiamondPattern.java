package day6_08_07_2026;

public class Answer1_DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 5;

	        // Upper half
	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int space = i; space < rows; space++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower half
	        for (int i = rows - 1; i >= 1; i--) {
	            // Print spaces
	            for (int space = rows; space > i; space--) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
