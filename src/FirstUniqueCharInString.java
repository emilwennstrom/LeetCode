import java.util.HashMap;

public class FirstUniqueCharInString {


    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));


    }


    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hashMap.containsKey(c)){
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
