package baekjoon;

import java.util.*;

/*
 * �Է��� ���ڸ�ŭ�� ���� ������ ���
 * 
 * 	            
 */
public class Q10992 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// ���� ���
		for(int i = 0 ; i < num ; i++) {
			for(int j = num - 1 ; j > i ; j--) {
				System.out.print(" ");
			}
			
		// �� ���
			for(int j = 0; j < 2 * i + 1 ; j++) {
				if(j == 0 || (j == i * 2)|| i == num - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			
			System.out.print("\n");
		}
	}

}
/*
 j = 0; j < 5 ; j++
 if(j = 0 || j == 4 || 2 == 2)

 *  ->> j = 1
* * ->> j = 0 || j = 2

  *   ->> j = 2
 * *  ->> j = 1 || j = 3
*   * ->> j = 0 || j = 4

   *   ->> j = 3
  * *  ->> j = 2 || j = 4 // 0 1 2
 *   * ->> j = 1 || j = 5 // 0 4
*     *->> j = 0 || j = 6 




*/