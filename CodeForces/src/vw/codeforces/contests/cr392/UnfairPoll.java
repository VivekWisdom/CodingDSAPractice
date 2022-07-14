/**
 * 
 */
package vw.codeforces.contests.cr392;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class UnfairPoll {

	/**
	 * @param args
	 * Copied from codeforces submissions..
	 */
	public static void main(String[] args) {

		int n, m, x, y;
		long k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextLong();
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		long repeat;
		if (n == 1)
			repeat = k / m;
		else
			repeat = k / ((2 * n - 2) * m);
		long a[][] = new long[n + 1][m + 1];
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++) {
				if (i == 1 || i == n)
					a[i][j] = repeat;
				else
					a[i][j] = 2 * repeat;
				k -= a[i][j];
			}
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++)
				if (k-- > 0)
					a[i][j]++;
				else
					break;
		for (int i = n - 1; i > 1; i--)
			for (int j = 1; j <= m; j++)
				if (k-- > 0)
					a[i][j]++;
				else
					break;
		System.out.println(Arrays.deepToString(a));
		long min = a[1][1], max = a[1][1];
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++) {
				if (min > a[i][j])
					min = a[i][j];
				if (max < a[i][j])
					max = a[i][j];
			}
		System.out.print(max + " " + min + " " + a[x][y]);
	}

}
