package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q3046 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int r1 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		
		System.out.print(2 * r2 - r1);
	}

}
