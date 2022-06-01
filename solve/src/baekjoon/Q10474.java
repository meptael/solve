package baekjoon;

import java.io.*;
import java.util.*;

public class Q10474 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) break;
			
			bw.write((a / b) + " " + (a % b) + " / " + b + "\n");
			
		}
		
		bw.flush();
		bf.close();
		bw.close();
			
	}

}
