class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*' && !st.isEmpty()) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }

        return sb.toString();
    }
}