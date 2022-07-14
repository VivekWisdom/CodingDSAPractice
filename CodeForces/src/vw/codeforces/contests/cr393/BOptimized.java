/**
 * 
 */
package vw.codeforces.contests.cr393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vivek.wisdom
 *
 */
public class BOptimized {

	/**
	 * @param args
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(f.readLine());

		long h = Integer.parseInt(st.nextToken());
		long p = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		long left = n - 1;
		long right = h - n;

		long lo = 0, hi = p;

		while (lo < hi) {
			long mid = (lo + hi + 1) / 2;
			long sum = mid;
			if (left > mid - 1) {
				sum += (mid - 1) * (mid) / 2 + left - (mid - 1);
			} else {
				long i = (mid - 1) - left;
				sum += (mid - 1) * (mid) / 2 - i * (i + 1) / 2;
			}
			if (right > mid - 1) {
				sum += (mid - 1) * (mid) / 2 + right - (mid - 1);
			} else {
				long i = (mid - 1) - right;
				sum += (mid - 1) * (mid) / 2 - i * (i + 1) / 2;
			}
			if (sum <= p) {
				lo = mid;
			} else {
				hi = mid - 1;
			}
		}

		System.out.println(lo);

	}

}
