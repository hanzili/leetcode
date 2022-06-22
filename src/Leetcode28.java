import java.util.ArrayList;
import java.util.List;

public class Leetcode28 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        nums = sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for (; j < nums.length; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }
                int leftPointer = j + 1;
                int rightPoiniter = nums.length - 1;
                while (leftPointer < rightPoiniter) {
                    if (nums[i] > (long) target - nums[leftPointer] - nums[rightPoiniter] - nums[j]) rightPoiniter--;
                    if (nums[i] < (long) target - nums[leftPointer] - nums[rightPoiniter] - nums[j]) leftPointer++;
                    if (nums[i] == (long) target - nums[leftPointer] - nums[rightPoiniter] - nums[j]) {
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[leftPointer]);
                        result.add(nums[rightPoiniter]);
                        results.add(result);
                        while (rightPoiniter > leftPointer && nums[rightPoiniter] == nums[rightPoiniter - 1])
                            rightPoiniter--;
                        while (rightPoiniter > leftPointer && nums[leftPointer] == nums[leftPointer + 1]) leftPointer++;

                        leftPointer++;
                        rightPoiniter--;
                    }
                }
            }
        }
        return results;
    }

    public static int[] sort(int[] nums) {
        boolean sorted = true;
        for (int out = 0; out < nums.length; out++) {
            for (int in = 0; in < nums.length - 1; in++) {
                int a = nums[in + 1];
                int b = nums[in];
                if (a < b) {
                    nums[in] = a;
                    nums[in + 1] = b;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{-3,-1,0,2,4,5};
        fourSum(nums,1);
    }

}
