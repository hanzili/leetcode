public class Leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int SlowPointer;
        int FastPointer = 1;
        int Previous = nums[0];
        for (SlowPointer = 1; FastPointer < nums.length; FastPointer++) {
            if (Previous != nums[FastPointer]) {
                nums[SlowPointer] = nums[FastPointer];
                SlowPointer++;
            }
            Previous = nums[FastPointer];
        }
        return SlowPointer;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int a = removeDuplicates(nums);
        System.out.print(a);
    }
}
