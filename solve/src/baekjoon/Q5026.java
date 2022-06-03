package baekjoon;

import java.io.*;
import java.util.*;

public class Q5026 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(bf.readLine());
		String left, right;
		
		for(int i = 0 ; i < cnt ; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), "+");
				
			if(st.countTokens() == 2) {
				left = st.nextToken();
				right = st.nextToken();
					
				if(left.equals("0") && right.equals("0")){
					bw.write("0");
					break;
				} else {
					bw.write(String.valueOf(Integer.parseInt(left) + Integer.parseInt(right)) + "\n");
				}
				
			} else if(st.countTokens() == 1) {
				left = st.nextToken();
				
				if(left.equals("P=NP")) {
					bw.write("skipped\n");
				} else {
					bw.write(left + "\n");
					continue;
				}
			}
			
		}
		bw.flush();
		bf.close();
		bw.close();
	}
}

