package baekjoon;

import java.io.*;
import java.util.*;

public class Q2576 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num[] = new int[7];
		int sum = 0;
		int min = -1;
		
		for(int i = 0 ; i < 7 ; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			num[i] = Integer.parseInt(st.nextToken());
			
			if(num[i] % 2 == 1) {
				sum += num[i];
				if(min == -1)
					min = num[i];
				else {
					min = (num[i] > min) ? min : num[i];
				}
			}
		}
		
		if(sum != 0) {
			System.out.print(sum + "\n");
			System.out.print(min);
		} else
			System.out.print(min);
	}

}
