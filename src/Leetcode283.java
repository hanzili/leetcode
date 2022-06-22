public class Leetcode283 {
    public static void moveZeroes(int[] nums) {
        int SlowPointer = 0;
        for (int FastPointer = 0; FastPointer < nums.length; FastPointer++) {
            if (nums[FastPointer] != 0) {
                nums[SlowPointer] = nums[FastPointer];
                SlowPointer++;
            }
        }
        for (int start = SlowPointer; start < nums.length; start++) {
            nums[start] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
