class Solution {
    public String longestCommonPrefix(String[] strs) {

        // First string is taken as reference
        String firstWord = strs[0];

        // Try prefixes from longest to shortest
        for (int len = firstWord.length(); len >= 0; len--) {

            String prefix = firstWord.substring(0, len);

            boolean found = true;

            // Check whether every string starts with prefix
            for (int i = 1; i < strs.length; i++) {

                if (!strs[i].startsWith(prefix)) {
                    found = false;
                    break;
                }
            }

            // First valid prefix found is the answer
            if (found) {
                return prefix;
            }
        }

        return "";
    }
}