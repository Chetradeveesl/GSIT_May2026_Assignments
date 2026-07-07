package Week2_04_07_2026;

public class Program3_FrequencyofEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2, 4, 6, 2, 2, 7};
		for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;

            // Check if the element has already been processed
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            // Count frequency
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i] + " occurs " + count + " time");
            } else {
                System.out.println(arr[i] + " occurs " + count + " times");
            }
		}
	}

}
