import java.util.HashMap;

public class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> pairs= new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for (int index = 0; index < nums.length; index++) {
            if (pairs.containsKey(target - nums[index])) {
                result[0] = pairs.get(target-nums[index]);
                result[1] = index;
                break;
            } else {
                pairs.put(nums[index], index);
            }
        }
        return result;
    }
}
