/**
 * 
 */
package vw.codeforces.contests.cr321;

/**
 * @author vivek
 *
 */

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class KefaAndCompany implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int n = in.nextInt();
		int d = in.nextInt();
		ArrayList<Integer> m = new ArrayList<>();
		ArrayList<Integer> s = new ArrayList<>();
		int maxF = 0;
		int maxM = 0;
		long minFactor = 0;
		for (int i = 0; i < n; i++) {
			m.add(in.nextInt());
			s.add(in.nextInt());
		}
		maxF = Collections.max(s);
		maxM = m.get(s.indexOf(maxF));

		s.remove(Integer.valueOf(maxF));
		m.remove(Integer.valueOf(maxM));

		for (int i = 0; i < m.size(); i++) {
			for (int j = i + 1; j < m.size(); j++) {
				if (Math.abs(m.get(i) - m.get(j)) < d) {
					minFactor += s.get(i);
				}
			}
		}
		out.println(minFactor + maxF);

	}

	@Override
	public void close() throws IOException {
		in.close();
		out.close();
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			reader.close();
		}
	}

	public static void main(String[] args) throws IOException {
		try (KefaAndCompany instance = new KefaAndCompany()) {
			instance.solve();
		}
	}
}
