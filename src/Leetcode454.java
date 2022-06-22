import java.util.HashMap;
import java.util.Map;

public class Leetcode454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> nums12Map = merge(nums1, nums2);
        HashMap<Integer,Integer> nums34Map = merge(nums3, nums4);
        int valid = 0;
        for (Map.Entry<Integer, Integer> entry : nums12Map.entrySet()) {
            int key = entry.getKey();
            int occurrence12 = entry.getValue();
            if (nums34Map.containsKey(0-key)) {
                int occurrence34 = nums34Map.get(0-key);
                valid += occurrence12 * occurrence34;
            }
        }
        return valid;
    }

    public static HashMap<Integer,Integer> merge(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> merge = new HashMap<Integer, Integer>();
        for (int num1: nums1) {
            for (int num2: nums2) {
                int sum = num1+num2;
                if (!merge.containsKey(sum)) merge.put(sum, 1);
                else merge.replace(sum, merge.get(sum)+1);
            }
        }
        return merge;
    }

    public static void main(String args[]) {
        int[] num1 = new int[]{1};
        int[] num2 = new int[]{-1};
        int[] num3 = new int[]{0};
        int[] num4 = new int[]{1};
        int a = fourSumCount(num1,num2, num3, num4);
        System.out.print(a);
    }
}
