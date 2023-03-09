public class ReverseWords {

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int k = i;
                if (s.charAt(k) == ' ')
                    k--;
                while (k >= 0 && s.charAt(k) != ' ') {
                    result.append(s.charAt(k--));
                }
                if (i != s.length() - 1)
                    result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

    }

}
