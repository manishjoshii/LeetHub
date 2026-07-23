class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0; // Write position
        int i = 0;

        while (i < n) {
            char curr_char = chars[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < n && chars[i] == curr_char) {
                count++;
                i++;
            }

            chars[index++] = curr_char;  // assign curr element and increament index

            // Write count if > 1
            if (count > 1) {
                // store more that 9 value as diff char as 10 = '1','0'
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}