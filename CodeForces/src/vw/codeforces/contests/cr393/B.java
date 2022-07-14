/**
 * 
 */
package vw.codeforces.contests.cr393;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();

		int[] arr = new int[n + 1];
		for (int i = 1; i <= k; i++) {
			arr[i] = (i - 1) + 1;
		}
		for (int i = k + 1; i <= n; i++) {
			arr[i] = arr[i - 1] - 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	
	
	
	
	
	
	
	
	
	
	
}










