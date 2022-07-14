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
public class InsertionSortDesc {

	/**
	 * @param args
	 *            Insertion sort in decreasing order. CLRS 2.1-2
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Numbers separated by space :");
		int[] arr = readStringToIntArray();

		System.out.println("Insertion Sort of the array is :" + Arrays.toString(insertionSortDesc(arr)));
	}

	private static int[] insertionSortDesc(int[] arrToSort) {
		for (int i = 1; i < arrToSort.length; i++) {
			int key = arrToSort[i];
			int j = i - 1;
			for (; j >= 0 && arrToSort[j] < key; j--) {
				arrToSort[j + 1] = arrToSort[j];
			}
			arrToSort[j + 1] = key;
		}
		return arrToSort;
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
