public class Leetcode209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int SlowPointer = 0;
        int minlength = (int) Double.POSITIVE_INFINITY;
        int change = 0;
        while(SlowPointer < nums.length) {
            int sum = nums[SlowPointer];
            int count = 1;
            for (int FastPointer = SlowPointer + 1; FastPointer < nums.length && sum < target; FastPointer++) {
                sum = sum + nums[FastPointer];
                count++;
            }
            SlowPointer++;
            if (sum == target && count < minlength) {
                minlength = count;
                change++;
            }
        }
        if (change > 0) return minlength;
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int b = minSubArrayLen(11,nums);
        System.out.print(b);
    }
}
