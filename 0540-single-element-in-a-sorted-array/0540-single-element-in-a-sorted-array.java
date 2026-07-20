class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0, res = 0;
        while (i < nums.length) {
            if (i != nums.length - 1 && nums[i] == nums[i + 1]) {
                i = i + 2;
            } else {
                res = nums[i];
                break;
            }
        }
        return res;
    }
}