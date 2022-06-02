package baekjoon;

import java.io.*;
import java.util.*;

public class Q11006 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int cnt = Integer.parseInt(st.nextToken());
		
		while(cnt != 0) {
			st = new StringTokenizer(bf.readLine(), " ");
			
			int broken = Integer.parseInt(st.nextToken());
			int chicken = Integer.parseInt(st.nextToken());
			
			int legs = chicken * 2;
			int lostlegs = broken - chicken;
			
			sb.append(lostlegs).append(" ").append(chicken - lostlegs).append("\n");
			
			cnt--;
		}
		
		System.out.print(sb.toString());	

	}

}
