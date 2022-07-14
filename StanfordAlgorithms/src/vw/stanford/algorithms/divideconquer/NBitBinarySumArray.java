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
public class NBitBinarySumArray {

	/**
	 * @param args
	 *            Sum of two N bit binary number stored in array. Print sum.
	 *            CLRS 2.1-4
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter First binary numbers:");
		int[] arr1 = readStringToIntArray();
		System.out.println("Enter Second binary numbers:");
		int[] arr2 = readStringToIntArray();
		System.out.println("Insertion Sort of the array is :" + Arrays.toString(nBitBinarySumArray(arr1, arr2)));
	}

	private static int[] nBitBinarySumArray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int[] result = new int[n + 1];
		int carry = 0;
		for (int i = n - 1; i >= 0; i--) {
			int sum = arr1[i] + arr2[i] + carry;
			result[i + 1] = (sum) % 2;
			carry = sum / 2;
		}
		result[0] = carry;
		return result;
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
