/**
 * 
 */
package vw.codeforces.contests.cr393;

import java.io.*;
import java.util.*;

/**
 * @author vivek.wisdom
 *
 */

public class AOptimized {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int m = in.nextInt() - 1;
		int d = in.nextInt();
		if (DAYS_IN_MONTH[m] >= (37 - d)) {
			out.println(6);
		} else if (DAYS_IN_MONTH[m] < (30 - d)) {
			out.println(4);
		} else {
			out.println(5);
		}
		long endTime = System.nanoTime();
		err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
		exit(0);
	}

	static int[] DAYS_IN_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	static void exit(int a) {
		out.close();
		err.close();
		System.exit(a);
	}

	static InputStream inputStream = System.in;
	static OutputStream outputStream = System.out;
	static OutputStream errStream = System.err;
	static InputReader in = new InputReader(inputStream);
	static PrintWriter out = new PrintWriter(outputStream);
	static PrintWriter err = new PrintWriter(errStream);

}