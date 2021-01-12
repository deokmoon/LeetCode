package com.leetcode.array;

public class MoveZeros283 {
	public void moveZeroes(int[] nums) {
		for (int i = 0; i <nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == 0 && nums[j] != 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					break;
				}
			}
		}
	}

	/*
	* 0이 아닌 값을 카운트 / ++ 연산(수행 후 값 + 1처리) 활용
	*   - 0이 아닌 값은 순차적으로 nums 배열에 입력
	*   - 카운트 값이 index가 되어 nums길이의 나머지를 0으로 채움
	*
	* */
	class Solution {
		public void moveZeroes(int[] nums) {
			int count = 0;
			int n = nums.length;
			for (int i = 0; i < n; i++){
				if(nums[i] != 0){
					nums[count++] = nums[i];
				}
			}
			for (int j = count; j < n; j++){
				nums[j] = 0;
			}
		}
	}
}
