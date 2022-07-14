/**
 * 
 */
package vw.codeforces.contests.cr4A;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class Watermelon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num > 2 && num % 2 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
