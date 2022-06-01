package baekjoon;

import java.io.*;
import java.util.*;

public class Q1284 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		while(num != 0) {
			int crt = 1;
			
			while(num != 0) {
				int a = num % 10;
				if( a == 0) {
					crt += 4;
				} else if ( a == 1) {
					crt += 2;
				} else {
					crt += 3;
				}
				crt++;
				num /= 10;
			}
			
			bw.write(crt + "\n");
			num = Integer.parseInt(bf.readLine());
		}
		
		bw.flush();
        bf.close();
        bw.close();
	}
		
}


