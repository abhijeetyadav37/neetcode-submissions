/*
Create a count[] array where each index represents a character.

count[0] = frequency of 'a'
count[1] = frequency of 'b'
...
count[25] = frequency of 'z'

Increase count for characters in s.
Decrease count for characters in t.

If all values become 0, the strings are anagrams.
Otherwise, they are not.
*/

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}