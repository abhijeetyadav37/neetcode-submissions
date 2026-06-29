class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {

            // Match found
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // Always move through t
            j++;
        }

        // If we've matched all characters of s, it's a subsequence
        return i == s.length();
    }
}