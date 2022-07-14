/**
 * 
 */
package vw.stanford.algorithms.divideconquer;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 *            Search a value in a Array of size n, if found return index,
	 *            else -1 CLRS 2.1-3
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Numbers separated by space :");
		int[] arr = readStringToIntArray();
		System.out.println("Enter value to search :");
		int val = readInt();
		System.out.println("The value " + val + " is in position :" + linearSearch(arr, val));
	}

	private static int linearSearch(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

	private static int readInt() {
		return in.nextInt();
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
