package baekjoon;

import java.io.*;
import java.util.*;

public class Q13118 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int people[] = new int[4];
		int apple[] = new int[3];
		
		int crt = 0;
		
		for(int i = 0 ; i < 4 ; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine());
		
		for(int i = 0 ; i < 3 ; i++) {
			apple[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0 ; i < 4 ; i++) {
			if(people[i] == apple[0]) {
				crt = i+1;
				break;
			}
		}
		
		System.out.println(crt);
	
	}

}
