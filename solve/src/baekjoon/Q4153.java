package baekjoon;

import java.io.*;
import java.util.*;
import java.math.*;

/*
 * 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 */

public class Q4153 {
	
	static String triangle(int a, int b, int c) {
		String ans;
		
		ans = Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)) ? "right" : "wrong";
		
		return ans;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String ans;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == 0 && b == 0 && c == 0)
				break;
			
			int max = a;
			
			if(a >= b) {
				if(a > c) {
					max = a;
					ans = triangle(max, b, c);
				} else {
					max = c;
					
					ans = triangle(max, a, b);
				}
			} else if(b >= c) {
				max = b;
				
				ans = triangle(max, a, c);
			} else {
				max = c;
				
				ans = triangle(max, a, b);
			}
			
			bw.write(ans +"\n");
		}
		
		bw.flush();
		bf.close();
		bw.close();

	}

}
