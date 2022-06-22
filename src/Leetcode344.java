public class Leetcode344 {
    public static void reverseString(char[] s) {
        int a = 0;
        int b = s.length-1;
        while (Math.abs(a-b)>=1 && a<b) {
            char store = s[a];
            s[a] = s[b];
            s[b] = store;
            a++;
            b--;
        }
    }

    public static void main(String args[]) {
        char[] s = new char[]{',',' ','a',' '};
        for (char a:s) {
            System.out.print(a+", ");
        }
        System.out.print("\n");
        reverseString(s);
        for (char a:s) {
            System.out.print(a+", ");
        }


    }
}
