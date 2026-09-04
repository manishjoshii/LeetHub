class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (i < j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            int area = w * h;
            max = Math.max(max, area);

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }

        }
        return max;
    }
}