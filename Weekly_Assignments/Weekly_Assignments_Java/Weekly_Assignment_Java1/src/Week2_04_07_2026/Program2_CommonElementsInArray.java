package Week2_04_07_2026;

public class Program2_CommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 5, 7, 9, 11, 5};
		int arr2[] = {1, 5, 7, 15, 20, 5};

		for (int i = 0; i < arr1.length; i++) {
            boolean alreadyPrinted = false;

            // Check if arr1[i] has already appeared in arr1
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check if the element exists in arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
		}
	}

}
