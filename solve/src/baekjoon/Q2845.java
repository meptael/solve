package baekjoon;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.*;

public class Q2845 {

	public static void main(String[] args) throws IOException {
		/*
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		
		int news[] = new int[5];
		
		for(int i = 0 ; i <= 4 ; i++) {
			news[i] = sc.nextInt();
			System.out.print(news[i] - c + " ");
		}
		*/
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		int cnt = 1;
		for(int i = 0 ; i <= 1 ; i++) {
			cnt *= Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine());
		while(st.hasMoreTokens()) {
			int x = Integer.parseInt(st.nextToken());
			sb.append(x - cnt).append(" ");
		}	
		System.out.println(sb);
	}

}
