class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int i = 1;
        int inc = 1, dec = 1;
        int result = 1;

        while (i < nums.length) {
            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            } else {
                inc=1;
                dec=1;
            }
            result = Math.max(result, Math.max(inc, dec));
            i++;
        }
        return result;
    }
}