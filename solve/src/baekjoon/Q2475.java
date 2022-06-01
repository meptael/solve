package baekjoon;
import java.util.Scanner;

public class Q2475 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int ans = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <= 4 ; i++) {
			a[i] = sc.nextInt();
			ans += a[i] * a[i];
		}
		System.out.println(ans%10);
	}

}
