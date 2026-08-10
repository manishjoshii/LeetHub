class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] output_arr = new int[n];
        Arrays.fill(output_arr, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n * 2; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i % n]) {
                output_arr[st.pop()] = nums[i % n];
            }
            if (i < n) st.push(i);
        }
        
        return output_arr;
    }
}