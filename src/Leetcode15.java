import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums==null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        nums = sort(nums);
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        for (int index = 0; index < nums.length; index++) {
            if (index+1<nums.length && nums[index]==nums[index+1]) {
                continue;
            }
            int sum = nums[leftPointer] + nums[rightPointer] + nums[index];
            leftPointer = index+1;
            rightPointer = nums.length - 1;
            while (leftPointer < rightPointer) {
                if (sum > 0) rightPointer--;
                if (sum < 0) leftPointer++;
                if (sum == 0) {
                    result.add(Arrays.asList(nums[leftPointer], nums[index], nums[rightPointer]));
                    while (rightPointer > leftPointer && nums[rightPointer] == nums[rightPointer - 1]) rightPointer--;
                    while (rightPointer > leftPointer && nums[leftPointer] == nums[leftPointer + 1]) leftPointer++;
                    rightPointer--;
                    leftPointer++;
                }
            }
        }
        return result;
    }

    public static int[] sort(int[] nums) {
        boolean sorted = true;
        for (int out = 0; out < nums.length; out++) {
            for (int in = 0; in < nums.length - 1; in++) {
                int a = nums[in+1];
                int b = nums[in];
                if (a<b) {
                    nums[in] = a;
                    nums[in+1] = b;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        return nums;
    }
     public static void display(int[] nums) {
         for (int index = 0; index < nums.length; index++) {
             System.out.print(nums[index]+", ");
         }
     }

    public static void main(String args[]){
        int[] nums = new int[]{1,5,-5,0,0};
        int[] a = new int[]{1,-1};
        sort(a);
        display(a);
        List<List<Integer>> aha = threeSum(nums);
    }
}
