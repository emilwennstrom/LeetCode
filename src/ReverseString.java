import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        while (low < high) {
            char tmp = s[low];
            s[low] = s[high];
            s[high] = tmp;
            high--;
            low++;
        }

       //reverseString(s, 0, s.length - 1);
    }

    public static void reverseString(char[] s, int low, int high) {
      if (low >= high) return;
      char tmp = s[low];
      s[low] = s[high];
      s[high] = tmp;
      reverseString(s, low + 1, high - 1);
    }


    public static void main(String[] args) {

        char[] s = {'s', 't', 'r', 'i', 'n', 'g'};
        reverseString(s);

        System.out.println(Arrays.toString(s));



    }

}
