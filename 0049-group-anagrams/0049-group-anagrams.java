class Solution {

    public String generateSortedString(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        String res = "";
        for (int j = 0; j < 26; j++) {
            String temp = "";
            if (arr[j] > 0) {
                temp = String.valueOf(j + 'a').repeat(arr[j]);
            }
            res += temp;
        }

        return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = generateSortedString(str);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    // O(n*(k*log k)) where n is length of array and k is max length of string in array
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     Map<String, List<String>> map = new HashMap<>();

    //     for (String str : strs) {
    //         char[] charArr = str.toCharArray();
    //         Arrays.sort(charArr);
    //         String sortedStr = new String(charArr);

    //         if (!map.containsKey(sortedStr)) {
    //             map.put(sortedStr, new ArrayList<>());
    //         }
    //         map.get(sortedStr).add(str);
    //     }

    //     return new ArrayList<>(map.values());
    // }
}