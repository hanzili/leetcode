class Leetcode704 {
    public static int[] partition(int[] nums, int start, int end) {
        if (start>end) return null;
        int[] new_nums = new int[end - start + 1];
        for (int index = start; index <= end; index++) {
            new_nums[index-start] = nums[index];
        }
        return new_nums;
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            mid = mid + 1;
            int[] new_num = partition(nums, mid, end);
            if (new_num!=null) {
                int a = search(new_num,target);
                if (a!=-1) return mid + search(new_num, target);
            }
        } else if (nums[mid] > target) {
            mid = mid - 1;
            int[] new_num = partition(nums, start, mid);
            if (new_num!=null) {
                int a = search(new_num, target);
                if (a!=-1) return a;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int a = search(nums,-1);
        System.out.println(a);
    }
}