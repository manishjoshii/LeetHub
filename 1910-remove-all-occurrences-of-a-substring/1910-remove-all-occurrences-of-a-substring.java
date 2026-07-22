class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i <= sb.length() - part.length()) {
            if (sb.substring(i, i + part.length()).equals(part)) {
                sb.delete(i, i + part.length());
                i = Math.max(0, i - part.length());
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}