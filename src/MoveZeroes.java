public class MoveZeroes {
	/*
		Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
		Note that you must do this in-place without making a copy of the array.

		Example 1:
		Input: nums = [0,1,0,3,12]
		Output: [1,3,12,0,0]
	 */

	/*public static void moveZeroes(int[] nums) {
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j+1];
					nums[j+1] = 0;
				}
			}
		}
	}*/


	public static void moveZeroes(int[] nums) {
		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				size++;
			} else if (size > 0) {
				int t = nums[i];
				nums[i] = 0;
				nums[i-size] = t;
			}
		}
	}

	public static void main(String[] args) {

		moveZeroes(new int[] {0,1,0,3,12});

	}



}
