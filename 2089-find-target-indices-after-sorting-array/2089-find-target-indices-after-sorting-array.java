class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;
        int equal = 0;

        for (int n : nums) {
            if (n < target) {
                less++;
            } else if (n == target) {
                equal++;
            }
        }
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < equal; i++) {
            result.add(i + less);
        }
        return result;
    }
}