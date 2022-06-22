public class Leetcode541 {
    public static String reverseStr(String s, int k) {
        char[] s_array = s.toCharArray();
        int rest = s_array.length;
        int start = 0;
        int end = k-1;
        while (rest > 0) {
            if(rest >= k) {
                reverseString(s_array, start, end);
                start += 2 * k;
                end += 2 * k;
                rest -= 2 * k;
            } else if (rest < k){
                reverseString(s_array,start,s_array.length-1);
                break;
            }
        }
        return new String(s_array);
    }

    public static void reverseString(char[] s, int start, int end) {
        int a = start;
        int b = end;
        while (Math.abs(a-b)>=1 && a<b) {
            char store = s[a];
            s[a] = s[b];
            s[b] = store;
            a++;
            b--;
        }
    }

    public static void main(String args[]) {
        reverseStr("a",2);

    }
}
