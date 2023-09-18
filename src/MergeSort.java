
import java.util.Arrays;
import java.util.Random;

public class MergeSort {



    static void mergeSort(int[] nums){
        if (nums.length == 1) return;
        int[] left = Arrays.copyOfRange(nums, 0, nums.length / 2);
        int[] right = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
        mergeSort(left);
        mergeSort(right);
        merge(nums, left, right);
    }

    static void merge(int[] nums, int[] left, int[] right) {
        int l = 0, r = 0, i = 0;
        while(l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                nums[i++] = left[l++];
            } else if (right[r] < left[l]) {
                nums[i++] = right[r++];
            }
            else {
                nums[i++] = left[l++];
                nums[i++] = right[r++];
            }
        }
        while (l < left.length) {
            nums[i++] = left[l++];
        }
        while(r < right.length) {
            nums[i++] = right[r++];
        }
    }

    public static void main(String[] args) {

        int n = 30;
        int[] nums = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(-20, 20);
        }
        System.out.println(Arrays.toString(nums));
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }



}
