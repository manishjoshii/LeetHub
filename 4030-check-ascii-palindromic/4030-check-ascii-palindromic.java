class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            String binary = Integer.toBinaryString(c);
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
            str.append(binary);
        }

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}