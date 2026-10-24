class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int l = m * n;
        int sum = 0;

        int expectedSum = (l * (l + 1)) / 2;

        int a = grid[0][0];

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (set.contains(grid[i][j])) {
                    a = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }

                sum += grid[i][j];
            }
        }

        int b = expectedSum + a - sum;

        return new int[] { a, b };
    }
}