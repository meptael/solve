package baekjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class  Q10430 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		BigInteger C = new BigInteger(st.nextToken());
		

		System.out.println((A.add(B).remainder(C)));
		System.out.println((A.remainder(C).add(B.remainder(C))).remainder(C));
		System.out.println((A.multiply(B)).remainder(C));
		System.out.println((A.remainder(C).multiply(B.remainder(C))).remainder(C));

	}
}
