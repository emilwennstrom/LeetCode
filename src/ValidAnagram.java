
public class ValidAnagram {


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
            num[t.charAt(i) - 'a']--;
        }
        for (int n : num) {
            if (n != 0) return false;
        }
        return true;
    }









}
