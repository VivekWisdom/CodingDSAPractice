/**
 * 
 */
package vw.codeforces.contests.cr378;

import java.util.Scanner;

/**
 * @author vivek
 *Successful
 */
public class GrasshoperAndTheString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String[] chars = in.next().split("");
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i].equals("A") || chars[i].equals("E") || chars[i].equals("I") || chars[i].equals("O")
					|| chars[i].equals("U") || chars[i].equals("Y")) {
				count = 0;
				continue;
			} else {
				count += 1;
				if (count > maxCount)
					maxCount = count;
			}
		}
		System.out.println(maxCount+1);
	}

}
