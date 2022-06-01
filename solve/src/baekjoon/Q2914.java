package baekjoon;

import java.io.*;
import java.util.*;

public class Q2914 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		System.out.print(num * (num2 - 1) + 1);

	}

}
