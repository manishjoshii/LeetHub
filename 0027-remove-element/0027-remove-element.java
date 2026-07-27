class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                // nums[j] = -1;     even without marking element as -1 just by swapping we can consider as removed
                j--;
            } else {
                i++;
            }
        }
        return j + 1;
    }
}