public class Leetcode27 {
    public static int removeElement(int[] nums, int val) {
        int swaps = 0;
        for (int index = 0; index < nums.length-1; index++) {
            if (nums[index]==val && nums[index+1]!=val) {
                int a = nums[index+1];
                nums[index+1]=nums[index];
                nums[index] = a;
                swaps++;
            }
        }
        if (swaps!=0) removeElement(nums,val);
        int num = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]==val) num++;
        }
        return nums.length - num;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int b = removeElement(nums,2);
        for (int i = 0; i < nums.length;i++) {
            System.out.print(nums[i]+" ,");
        }
        System.out.println(" ");
        System.out.print(b);
    }
}
