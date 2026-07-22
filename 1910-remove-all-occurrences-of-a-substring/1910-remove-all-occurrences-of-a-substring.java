class Solution {

    //approach 1

    // boolean check(Stack<Character> st, String part, int n) {
    //     //create temp stack and copy original chars in it
    //     Stack<Character> s = new Stack<>();
    //     s.addAll(st);

    //     for (int i = n - 1; i >= 0; i--) {
    //         char ch = s.pop();
    //         if (ch != part.charAt(i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public String removeOccurrences(String s, String part) {
    //     Stack<Character> st = new Stack<>();
    //     int m = s.length();
    //     int n = part.length();

    //     // push chars without part in stack
    //     for (int i = 0; i < s.length(); i++) {
    //         st.push(s.charAt(i));

    //         // check and remove part chars from stack
    //         if (st.size() >= n && check(st, part, n) == true) {
    //             for (int j = 0; j < n; j++) {
    //                 st.pop();
    //             }
    //         }
    //     }

    //     StringBuilder sb = new StringBuilder();

    //     while (!st.isEmpty()) {
    //         sb.append(st.pop());
    //     }

    //     int l = 0, r = sb.length() - 1;
    //     // reverse the string
    //     while (l <= r) {
    //         char c = sb.charAt(l);
    //         sb.setCharAt(l, sb.charAt(r));
    //         sb.setCharAt(r, c);
    //         l++;
    //         r--;
    //     }

    //     return sb.toString();
    // }

    //approach 2

    // public String removeOccurrences(String s, String part) {
    //     StringBuilder sb = new StringBuilder(s);
    //     int i = 0;
    //     while (i <= sb.length() - part.length()) {
    //         if (sb.substring(i, i + part.length()).equals(part)) {
    //             sb.delete(i, i + part.length());
    //             i = Math.max(0, i - part.length());
    //         } else {
    //             i++;
    //         }
    //     }
    //     return sb.toString();
    // }

    //approach 3
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }
}