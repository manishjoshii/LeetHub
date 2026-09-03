class Solution {
    public int majorityElement(int[] nums) {
        int answer = 0, count = 0;
        for (int n : nums) {
            if (count == 0) {
                answer = n;
            }
            if (answer == n) {
                count++;
            } else {
                count--;
            }
        }
        return answer;
    }
}