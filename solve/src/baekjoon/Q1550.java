package baekjoon;
import java.util.Scanner;

public class Q1550 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int a = Integer.parseInt(input, 16);
		sc.close();
		System.out.println(a);
		
		String b = Integer.toHexString(a);
		System.out.println(b);

		String c = Integer.toBinaryString(a);
		String d = Integer.toOctalString(a);
		
		System.out.println(c + "\n" + d);
	}

}
