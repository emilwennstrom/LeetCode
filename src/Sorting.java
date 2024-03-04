import java.util.Arrays;
import java.util.Random;

public class Sorting {


	public static void main(String[] args) {
		int[] nums = new int[10];
		Random r = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(0, 100);
		}
		//quickSort(nums);
		//insertionSort(nums);
		//selectionSort(nums);
		shellSort(nums);
		System.out.println(isSorted(nums));
		System.out.println(Arrays.toString(nums));


	}


	private static void shellSort(int[] nums) {
		int gap = nums.length / 2;
		while (gap > 0) {
			for (int i = gap; i < nums.length; i++){
				insert(nums, i, gap);
			}
			if (gap == 2) gap = 1;
			else gap = (int) (gap / 2.2);
		}

	}

	private static void insert(int[] nums, int nextPos, int gap) {
		int nextVal = nums[nextPos];
		while (nextPos > gap - 1 && nums[nextPos - gap] > nextVal) {
			nums[nextPos] = nums[nextPos - gap];
			nextPos -= gap;
		}
		nums[nextPos] = nextVal;
	}


	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = tmp;
		}
	}



	public static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int data = nums[i];
			int j = i;
			while (j > 0 && data < nums[j - 1]) {
				nums[j] = nums[j - 1];
				j--;
			}
			nums[j] = data;
		}
	}


	public static void quickSort(int[] nums) {
		if (nums.length < 2) return;
		quickSort(nums, 0, nums.length - 1);
	}

	private static void quickSort(int[] nums, int low, int high) {
		if (low < high) {
			int pivot = partition(nums, low, high);
			quickSort(nums, low, pivot - 1);
			quickSort(nums, pivot + 1, high);
		}
	}

	private static boolean isSorted(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1])
				return false;
		} return true;
	}

	private static int partition(int[] nums, int low, int high) {
		int pivot = nums[low];
		int up = low;
		int down = high;
		while (up < down) {
			while (nums[up] <= pivot && up < high) {
				up++;
			}
			while (nums[down] > pivot && down > low) {
				down--;
			}
			if (up < down) {
				int tmp = nums[up];
				nums[up] = nums[down];
				nums[down] = tmp;
			}
		}
		nums[low] = nums[down];
		nums[down] = pivot;
		return down;
	}
}
