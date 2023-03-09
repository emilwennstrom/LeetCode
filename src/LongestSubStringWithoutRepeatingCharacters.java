import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
           if (hashMap.containsKey(s.charAt(i))) {
               count = 0;
               i = hashMap.get(s.charAt(i)) + 1;
               hashMap.clear();
           }
           hashMap.put(s.charAt(i), i);
           count++;

           if (count > max) max = count;
        }
        return max;
    }

    // tmmzuxt  5
    // abcabcbb  3
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

}
