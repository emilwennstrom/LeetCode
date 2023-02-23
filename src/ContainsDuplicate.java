import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int num : nums) {
            if (!integerHashSet.add(num)) {
                return false;
            }
        }
        return true;

    }


}
