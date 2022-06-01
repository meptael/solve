package baekjoon;

import java.io.*;
import java.util.*;
import java.math.*;

public class Q3003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int num[] = new int[6];
		int chess[] = {1, 1, 2, 2, 2, 8};
		for (int i = 0 ; i <= 5 ; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			
			System.out.print(chess[i] - num[i]);
			System.out.print(" ");
				
		}
	}

}
