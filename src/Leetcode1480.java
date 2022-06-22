public class Leetcode1480 {
    public int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        int sum = 0;
        int counter = 0;
        for (int num: nums) {
            sum += num;
            runningsum[counter] = sum;
            counter++;
        }
        return runningsum;
    }
}
