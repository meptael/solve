package baekjoon;

import java.io.*;

public class Q2438 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		for(int i = 1 ; i <= num ; i ++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
