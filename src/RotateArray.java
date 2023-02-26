import java.util.Arrays;

public class RotateArray {



	public static void rotate(int[] nums, int k) {
		int[] tmp = nums.clone();
		for (int i = 0; i < nums.length; i++) {
			nums[(i+k) % nums.length] = tmp[i];
		}

	}


	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		rotate(nums, k);

		System.out.println(Arrays.toString(nums));
	}


}
