

public class BinarySearch {

    /*public static int search(int[] nums, int target) {
        int mid = nums.length / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] > target) return search(nums, target, 0, mid - 1);
        else return search(nums, target, mid + 1, nums.length - 1);
    }*/

    private static int search (int[] nums, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] > target) return search(nums, target, 0, mid - 1);
        else return search(nums, target, mid + 1, high);
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(high >= low) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;

        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        if (nums[mid] < target) return mid + 1;
        else return mid;
    }



    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = -2;

        System.out.println(searchInsert(nums, target));

    }
}
