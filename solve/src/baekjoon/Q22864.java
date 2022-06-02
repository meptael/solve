package baekjoon;

import java.io.*;
import java.util.*;

public class Q22864 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int hour_fatigue = Integer.parseInt(st.nextToken());
		int work = Integer.parseInt(st.nextToken());
		int reduce_fatigue = Integer.parseInt(st.nextToken());
		int max_fatigue = Integer.parseInt(st.nextToken());

		int fatigue = 0;
		int process = 0;
				
		for(int i = 0 ; i < 24 ; i++) {
			if(hour_fatigue > max_fatigue) {
				break;
			}
			
			if(max_fatigue >= fatigue + hour_fatigue) {
				process += work;
				fatigue += hour_fatigue;
			} else {
				fatigue -= reduce_fatigue;
				if(fatigue < 0) {
					fatigue = 0;
				}
			}
			
		}
		
		System.out.print(process);
	}
		
}

/*
 * 
 * 
 * 
 */
