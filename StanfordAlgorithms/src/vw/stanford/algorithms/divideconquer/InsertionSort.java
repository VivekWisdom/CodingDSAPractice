/**
 * 
 */
package vw.stanford.algorithms.divideconquer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 *            Insertion sort in decreasing order. CLRS 2.1-1
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Numbers separated by space :");
		int[] arr = readStringToIntArray();

		System.out.println("Insertion Sort of the array is :" + Arrays.toString(insertionSort(arr)));
	}

	private static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			for (; j >= 0 && arr[j] > key; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	private static int[] readStringToIntArray() {
		String[] arr = in.nextLine().split(" ");
		int[] arrToInt = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arrToInt[i] = Integer.parseInt(arr[i]);
		}
		return arrToInt;
	}
}
