/**
 * 
 */
package vw.codeforces.contests.cr392;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 * Done
 *
 */
public class HolidayOfEquality {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = max - arr[i];
		}
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println(sum);

	}

}
