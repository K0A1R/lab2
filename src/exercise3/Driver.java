package exercise3;

import java.util.Random;

public class Driver {

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main(String[] args) {
		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for (int i = 0; i < SIZE; i++) {
			nums[i] = rand.nextInt(UPPER_BOUND);
		}

		System.out.println("Before sorting:");
		printArray(nums);

		char choice = args[0].charAt(0);
		switch (choice) {
			case 'b':
				bubbleSortDescending(nums);
				break;
			case 'i':
			case 's':
			case 'q':
				break;
			default:
		}

		System.out.println("After sorting:");
		printArray(nums);
	}

	public static void bubbleSortDescending(Integer[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

	public static void printArray(Integer[] arr) {
		for (Integer num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}