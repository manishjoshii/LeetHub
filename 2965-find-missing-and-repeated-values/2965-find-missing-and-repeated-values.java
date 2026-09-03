class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        int actualSum = 0, expectedSum = n * (n + 1) / 2;
        Set<Integer> set = new HashSet<>();
        int a = 0, b = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                actualSum += grid[i][j];
                if (set.contains(grid[i][j])) {
                    a = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }

        b = expectedSum + a - actualSum;

        return new int[] { a, b };
    }
}