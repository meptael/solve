package baekjoon;

import java.io.*;

public class Q2441 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i < cnt ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(" ");
			}
				
			for(int j = i ; j < cnt ; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}