/**
 * 
 */
package vw.codeforces.contests.cr71A;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class WayTooLongWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			String word = in.next();
			if (word.length() > 10) {
				System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length() - 1));
			}else{
				System.out.println(word);
			}
		}

	}

}
