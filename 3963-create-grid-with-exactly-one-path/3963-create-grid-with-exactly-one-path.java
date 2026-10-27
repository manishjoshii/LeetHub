class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        String topRow = ".".repeat(n);
        String otherRow = "#".repeat(n - 1) + ".";

        for (int i = 0; i < m; i++) {
            res[i] = i == 0 ? topRow : otherRow;
        }
        return res;
    }
}