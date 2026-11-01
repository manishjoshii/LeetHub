class Solution {
    public int minMergedInteger(int[] nums) {
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (i < nums.length) {
            String s1 = String.valueOf(nums[i]);
            String s2 = String.valueOf(nums[i + 1]);
            min = Math.min(min, Integer.parseInt(s1 + s2));
            i += 2;
        }
        return min;
    }
}