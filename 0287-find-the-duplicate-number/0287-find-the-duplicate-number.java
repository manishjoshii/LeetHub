class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // consider values as index as values lies in only 1 to n
        slow = nums[slow];
        fast = nums[nums[fast]];

        // move slow by 1 value and fast by 2 values
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // once cycle detected initialize slow again to start
        slow = nums[0];

        // to now to find start of cycle move both pointer by 1 value only until they meet
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast; // return one of them as both are on same value;
    }
}