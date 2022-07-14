/**
 * 
 */
package vw.codeforces.contests.cr392;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class BlownGarland {

	/**
	 * @param args
	 * Done
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String[] s = in.next().split("");
		String[] t = new String[4];
		for (int i = 0; i < s.length; i++) {
			if (t[i % 4] == null) {
				if (!s[i].equals("!")) {
					t[(i % 4)] = s[i];
				}else{
					continue;
				}
			} else {
				continue;
			}
		}
		int R = 0;
		int B = 0;
		int Y = 0;
		int G = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("!")) {
				if (t[i % 4].equals("R")) {
					R += 1;
				} else if (t[i % 4].equals("B")) {
					B += 1;
				} else if (t[i % 4].equals("Y")) {
					Y += 1;
				} else if (t[i % 4].equals("G")) {
					G += 1;
				}
			}
		}
		System.out.println(R + " " + B + " " + Y + " " + G);
	}

}
