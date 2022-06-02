package baekjoon;


import java.io.*;
import java.util.*;
import java.math.*;

public class Q4619 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		
		while((B != 0) && (N != 0)) {
	
			int num = 0;
			int num2 = 0;
			
			for(int i = 1 ; i <= B ; i++) {
				int tmp = 1;
				for(int j = 1 ; j <= N ; j++) {
					tmp *= i;
				}
				if(tmp <= B) {
					num = i;
				} else if(tmp > B) {
					num2 = i;
					break;
				}
			}
			
			int result =(Math.abs(Math.pow(num, N) - B) <= Math.abs(Math.pow(num2, N) - B) ? num : num2);
			
			bw.write(result + "\n");
			
			st = new StringTokenizer(bf.readLine());
			B = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
		}
		bw.flush();
        bf.close();
        bw.close();

	}

}
