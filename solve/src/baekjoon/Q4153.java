package baekjoon;

import java.io.*;
import java.util.*;
import java.math.*;

/*
 * ���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.
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
