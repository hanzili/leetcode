import java.util.HashSet;
public class Leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        for (int num: nums1) {
            set1.add(num);
        }
        for (int num: nums2) {
            if (set1.contains(num)) {
                resSet.add(num);
            }
        }
        int[] repeat = new int[resSet.size()];
        int i = 0;
        for (int num: resSet) {
            repeat[i] = num;
            i++;
        }
        return repeat;
    }
}
