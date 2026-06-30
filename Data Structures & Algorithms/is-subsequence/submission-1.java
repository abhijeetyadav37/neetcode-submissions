class Solution {
  public boolean isSubsequence(String s, String t) {
    int i = 0;
    int j = 0;

    while (i < s.length() && j < t.length()) {
      if (s.charAt(i) == t.charAt(j)) {
        // neet == node , i++ , j will at n , e then j++ will at o , i at e ,
        //  then j at d i still e then j at e of node i++ next

        i++;
      }

      j++;
    }

    return i == s.length(); // if length  is eqaul to original s itmeans it have all char  
  }
}