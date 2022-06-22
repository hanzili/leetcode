public class Leetcode151 {
    public static String reverseWords(String s) {
        char[] s_array = removeSpace(s).toCharArray();
        reverseString(s_array, 0, s_array.length-1);
        int start = 0;
        int end = 0;
        for (; end < s_array.length; end++) {
            if (s_array[end]==' ') {
                reverseString(s_array,start,end-1);
                start = end+1;
            }
        }
        reverseString(s_array,start,end-1);
        String a = new String(s_array);
        return a;
    }

    /*public static char[] deleteSpace(char[] s) {
        int begin = 0;
        int shrink = 0;
        int shrink2 = 0;
        while (s[begin]==' ') begin++;
        int finish = s.length;
        while (s[finish-1]==' '){
            finish--;
            shrink++;
        }
        for (int index=begin; index < finish-shrink2; index++) {
            if (s[index]==' '){
                int end = index+1;
                while(end<s.length && s[end]==' ') {
                    end++;
                    shrink2++;
                }
                for (int start = index + 1;end<s.length;start++,end++) {
                    s[start]=s[end];
                }
            }
        }

        return Arrays.copyOfRange(s, begin, s.length-shrink-shrink2);
    }*/

    public static String removeSpace(String s) {
        // System.out.println("ReverseWords.removeSpace() called with: s = [" + s + "]");
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        // System.out.println("ReverseWords.removeSpace returned: sb = [" + sb + "]");
        return sb.toString();
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

    }
}
