import java.util.Arrays;

public class CountingBits {
	static int count = 0;
	public static void main(String[] args) {
		int n = 8;
		System.out.println(Arrays.toString(countBits(n)));
	}

	public static int[] countBits(int n) {
		int[] arr = new int[n + 1];
		Arrays.fill(arr, -1);
		countBits(0, n, arr);
		System.out.println(count);
		return arr;
	}

	public static void countBits(int start, int n, int[] arr) {
		if (start > n) return;
		int num = start;
		int noOfOnes = 0;
		while(num > 0) {
			count++;
			if (num % 2 == 1) {
				noOfOnes++;
			}
			num /= 2;
		}
		arr[start] = noOfOnes;
		countBits(start + 1, n, arr);

	}

}
