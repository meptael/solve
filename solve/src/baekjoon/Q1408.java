package baekjoon;

import java.io.*;
import java.util.*;

public class Q1408 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), ":");
		
		StringBuffer sb = new StringBuffer();
		
		int time[] = new int[3];
		int remain[] = new int[3];
		int result[] = new int[3];
		
		int time_sec;
		int remain_sec;
		
		int result_sec;
		int day_12 = 86400;
		
		while(st.hasMoreTokens()) {
			for(int i = 0 ; i < 3 ; i++) {
				time[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(bf.readLine(), ":");
		while(st.hasMoreTokens()) {
			for(int i = 0 ; i < 3 ; i++) {
				remain[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		time_sec = time[0] * 3600 + time[1] * 60 + time[2];
		remain_sec = remain[0] * 3600 + remain[1] * 60 + remain[2];
		
		if(time_sec > remain_sec) {
			result_sec = day_12 - Math.abs(remain_sec - time_sec);
		} else {
			result_sec = Math.abs(remain_sec - time_sec);
		}
		
		result[0] = result_sec / 3600;
		result[1] = (result_sec % 3600) / 60;
		result[2] = ((result_sec % 3600) % 60);
		
		for(int i = 0 ; i < 3 ; i++) {
			if(result[i] < 10) {
				sb.append('0' + Integer.toString(result[i]));
			} else
				sb.append(Integer.toString(result[i]));
			
			if(i != 2) {
				 sb.append(":");
			}
		}
		System.out.println(sb.toString());
	}

}
