package day6_08_07_2026;

public class Answer2_ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;

        // Upper half
        for (int i = 1; i <= rows; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int space = 1; space <= 2 * (rows - i); space++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int space = 1; space <= 2 * (rows - i); space++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}

}
