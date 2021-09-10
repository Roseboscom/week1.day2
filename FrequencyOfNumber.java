package week1.day2;

import java.util.Arrays;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
	    Arrays.sort(arr);

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != -1) {
				int count = 1;
				for (int j = i + 1; j < arr.length; ++j) {
					if (arr[i] == arr[j])

					{
						count = count + 1;
						arr[j] = -1;
					}

				}
				System.out.println(arr[i] + " occured " + count + " times");
			}

		}

	}

}
