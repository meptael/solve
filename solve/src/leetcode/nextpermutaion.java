package leetcode;

/*
 * 1 3(A) 9 5(B) 7
 * 
 * 
 * 
 */
public class nextpermutaion {

	public void main(int[] nums) {
		// TODO Auto-generated method stub
		// �ڿ��� ���� Ž���ϸ鼭 ���������� ������ �ε����� Ȯ�� (A)
		// �ٽ� �ڿ������� Ž���ϸ鼭 A���� ū ù ��° �ε����� Ȯ�� (B)
		// A�� B�� ����
		// A+1���� ������ �������� ����
		
		int a = nums.length-2;
		while(a >=0 && nums[a] >= nums[a+1]) a--;
		
		if(a != -1) {
			int b = nums.length-1;
			while(nums[a] >= nums[b]) b--;
			
			swap(nums, a, b);			
		}
		
		int start = a + 1;
		int end = nums.length-1;
		
		while(start < end) {
			swap(nums, start++, end--);
		}
		
		
	}
	public void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}

}
