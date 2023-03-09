import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int diff;
        for (int i = 0; i < numbers.length; i++) {
            diff = target - numbers[i];
            if (hashMap.containsKey(diff)) {
                return new int[] {hashMap.get(diff) + 1, i + 1};
            }
            hashMap.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
