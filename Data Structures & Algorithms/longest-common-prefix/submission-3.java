class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstWord = strs[0];

        for (int len = firstWord.length(); len >= 0; len--) {
            String prefix = firstWord.substring(0, len);

            boolean found = true;

            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix)) {
                    found = false;
                }
            }
            if (found) {
                return prefix;
            }
        }
        return "";
    }
}