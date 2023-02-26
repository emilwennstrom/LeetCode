public class MaxSubArray {

/*
	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum < nums[i])
				sum = nums[i];
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
*/

	public static int maxSubArray(int[] nums) {
		return maxSubArray(nums, 0, nums.length - 1);
	}

	public static int maxSubArray(int[] nums, int low, int high) {
		if (low == high) return nums[low];
		int sum = 0;
		int leftSum = Integer.MIN_VALUE;
		int rightSum = Integer.MIN_VALUE;
		int middle = (high + low) / 2;
		for (int i = middle; i >= low; i--) {
			sum += nums[i];
			leftSum = Math.max(leftSum, sum);
		}
		sum = 0;
		for (int i = middle + 1; i <= high; i++) {
			sum += nums[i];
			rightSum = Math.max(rightSum, sum);
		}
		int middleSum = leftSum + rightSum;
		return Math.max(Math.max(middleSum, maxSubArray(nums, low, middle)), maxSubArray(nums, middle + 1, high));
	}


	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {-2,-1}));
	}


}
