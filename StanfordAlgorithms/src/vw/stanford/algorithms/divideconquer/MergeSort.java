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
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Numbers separated by space :");
		String[] arr = in.nextLine().split(" ");
		int[] arrToSort = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arrToSort[i] = Integer.parseInt(arr[i]);
		}

		System.out.println("Merge Sort of the array is :" + Arrays.toString(mergeSort(arrToSort)));

	}

	private static int[] mergeSort(int[] arrToSort) {
		
		return arrToSort;
	}

}
