package baekjoon;

import java.util.*;
import java.io.*;

public class Q9226 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String word = bf.readLine();
		int length;
		
		while (!word.equals("#")) {
			length = word.length();
			int chk = 0;
			if(word.charAt(0) == 'a' || word.charAt(0) == 'e' ||
					word.charAt(0) == 'i' || word.charAt(0) == 'o'|| word.charAt(0) == 'u') {
				sb.append(word + "ay\n");
			} else {
				for(int i = 0 ; i < length ; i++) {
					if(word.charAt(i) == 'a' || word.charAt(i) == 'e' ||
							word.charAt(i) == 'i' || word.charAt(i) == 'o'|| word.charAt(i) == 'u') {
						chk = i;
						break;
					}
				}
				for(int i = 0 ; i < length - chk ; i++) {
					sb.append(word.charAt(chk + i));
				}
				for(int i = 0 ; i < chk ; i++) {
					sb.append(word.charAt(i));
				}
				
				sb.append("ay\n");
			}
			
			word = bf.readLine();
			
		}
		System.out.println(sb);
		bf.close();

	}

}
