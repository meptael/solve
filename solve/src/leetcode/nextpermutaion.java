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
		// 뒤에서 부터 탐색하면서 오름차순이 깨지는 인덱스를 확인 (A)
		// 다시 뒤에서부터 탐색하면서 A보다 큰 첫 번째 인덱스를 확인 (B)
		// A랑 B를 스왑
		// A+1에서 끝까지 오름차순 정열
		
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
