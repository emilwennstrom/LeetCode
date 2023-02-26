import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectTwoArraysII {


	public static int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> intersect = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int j : nums1) {
			if (!hashMap.containsKey(j)) {
				hashMap.put(j, 1);
			} else {
				hashMap.put(j, hashMap.get(j) + 1);
			}
		}

		for (int i : nums2) {
			if (hashMap.containsKey(i)) {
				int n = hashMap.get(i);
				if (n > 0) {
					intersect.add(i);
					hashMap.put(i, hashMap.get(i) - 1);
				}
			}
		}
		int[] ret = new int[intersect.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = intersect.get(i);
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2 = new int[] {2, 2};

		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}
}
