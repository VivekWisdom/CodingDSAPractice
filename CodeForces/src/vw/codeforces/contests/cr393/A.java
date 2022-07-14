/**
 * 
 */
package vw.codeforces.contests.cr393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vivek
 *
 */
public class A {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		br.close();

		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int res = (months[m - 1] + d - 1) / 7;
		if ((months[m - 1] + d - 1) % 7 != 0)
			System.out.println(res + 1);
		else
			System.out.println(res);
	}

}
