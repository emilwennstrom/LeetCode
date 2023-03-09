import java.util.HashMap;

public class RansomNote {

    // Each letter in magazine can only be used once in ransomNote.

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (!hashMap.containsKey(c)){
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (hashMap.get(c) == null || hashMap.get(c) == 0) {
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
        }
        return true;
    }


    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";

        System.out.println(canConstruct(ransomNote, magazine));


    }

}
