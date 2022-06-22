import java.util.Arrays;

public class Leetcode76 {
    public static String minWindow(String s, String t) {
        int[] tNum = checkChar(t);
        int SlowIndex = 0;
        int minlength = (int) Double.POSITIVE_INFINITY;
        String shortest = "";
        while (SlowIndex < s.length()) {
            int[] sliceS = new int[58];
            int count = 0;
            for (int FastIndex = SlowIndex; FastIndex < s.length(); FastIndex++) {
                sliceS[(int)(s.charAt(FastIndex)) - 65]++;
                count++;
                if (count >= t.length() && count <= minlength && compareStr(sliceS, tNum)) {
                    minlength = count;
                    shortest = s.substring(SlowIndex,FastIndex+1);
                }
            }
            SlowIndex++;
        }
        return shortest;
    }

    public static int[] checkChar(String s) {
        int[] nums = new int[58];
        for (char c : s.toCharArray()) {
            nums[(int) c - 65] ++;
        }
        return nums;
    }

    public static boolean compareStr(int[] large, int[] small) {
        for (int index = 0; index < small.length; index++) {
            if (small[index] != 0 && small[index] > large[index]) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String a = "a";
        String s = "a";
        String t = "a";
        System.out.print(minWindow(s,t));
    }
}
