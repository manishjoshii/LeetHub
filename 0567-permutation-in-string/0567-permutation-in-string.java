class Solution {
    // String sortString(String str) {
    //     // Converting input string to character array
    //     char tempArray[] = str.toCharArray();
    //     // Sorting temp array using
    //     Arrays.sort(tempArray);
    //     // Returning new sorted string
    //     return new String(tempArray);
    // }

    // public boolean checkInclusion(String s1, String s2) {
    //     s1 = sortString(s1); // sort s1

    //     for (int i = 0; i <= s2.length() - s1.length(); i++) {
    //         String temp = sortString(s2.substring(i, i + s1.length())); //take out substring and sort it
    //         if (s1.equals(temp)) { //check if matches with sorted s1
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        int[] s1_freq = new int[26];
        int[] s2_freq = new int[26];

        for (char ch : s1.toCharArray()) {
            s1_freq[ch - 'a']++;
        }

        int i = 0, j = 0;
        while (j < n) {
            s2_freq[s2.charAt(j) - 'a']++;

            if (j - i + 1 > m) {
                s2_freq[s2.charAt(i) - 'a']--;
                i++;
            }

            if (Arrays.equals(s1_freq, s2_freq)) {
                return true;
            }
            j++;
        }

        return false;
    }
}