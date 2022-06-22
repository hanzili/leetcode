public class Leetcode977 {
    public static int[] sortedSquares(int[] nums) {
        int LeftPointer = 0;
        int RightPointer = nums.length-1;
        int[] new_nums = new int[nums.length];
        int index = nums.length-1;
        while(index  >= 0 && LeftPointer <= RightPointer) {
            int LargerPointer = FindLarger(LeftPointer,RightPointer,nums);
            new_nums[index] = (int) Math.pow(nums[LargerPointer],2);
            index--;
            // update the pointer
            if (LargerPointer==LeftPointer) LeftPointer++;
            else RightPointer--;
        }
        return new_nums;
    }
    public static int FindLarger(int LeftPointer, int RightPointer, int[] nums) {
        if (Math.pow(nums[LeftPointer],2) > Math.pow(nums[RightPointer],2)) {
            return LeftPointer;
        }
        return RightPointer;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] new_nums = sortedSquares(nums);
        for (int index = 0; index < nums.length; index++) {
            System.out.print(new_nums[index]+ ", ");
        }
    }
}
