class Solution {
    public boolean canAliceWin(int n) {
        int rm = 10;
        boolean flag = false;
        while (n >= 1 && n >= rm) {
            n = n - rm;
            rm = rm - 1;
            flag = !flag;
        }
        return flag;
    }
}