package Week2_04_07_2026;

public class Program1_UniqueElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {5, 3, 8, 5, 2, 3, 9, 8};

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the element has already appeared
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.println(arr[i]);
            }
		}
	}

}
