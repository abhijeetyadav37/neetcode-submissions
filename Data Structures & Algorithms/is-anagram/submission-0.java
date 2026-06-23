// brute force me sort karte 2 -2 baar toh O(n log n)
// hoti h time complexity

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

      return  Arrays.equals(sarr, tarr);
    }
}
