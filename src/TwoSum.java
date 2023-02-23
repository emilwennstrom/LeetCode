import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /*
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */


    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(ints, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (hashMap.containsKey(diff)) {
                return new int[] {hashMap.get(diff), i};
            }
            hashMap.put(num, i);
        }
        return null;
    }


}
