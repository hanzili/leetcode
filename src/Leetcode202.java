import java.util.HashSet;
public class Leetcode202 {
    public boolean isHappy(int n) {
        HashSet<Integer> sums = new HashSet<Integer>();
        int a = n;
        while (a!=1 && !sums.contains(a)) {
            sums.add(a);
            a = findSum(n);
        }
        return a == 1;
    }
    public static int findSum(int n) {
        int sum = 0;
        while (n!=0) {
            int a = n % 10;
            sum += a * a;
            n = n / 10;
        }
        return sum;
    }
}
