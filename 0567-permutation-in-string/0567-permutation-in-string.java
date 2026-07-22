class Solution {
    String sortString(String str) {
        // Converting input string to character array
        char tempArray[] = str.toCharArray();
        // Sorting temp array using
        Arrays.sort(tempArray);
        // Returning new sorted string
        return new String(tempArray);
    }

    public boolean checkInclusion(String s1, String s2) {
        s1 = sortString(s1); // sort s1

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String temp = sortString(s2.substring(i, i + s1.length())); //take out substring and sort it
            if (s1.equals(temp)) { //check if matches with sorted s1
                return true;
            }
        }
        return false;
    }
}