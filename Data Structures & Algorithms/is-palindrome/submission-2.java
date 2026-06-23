// using two pointers
// O(1)

class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++; //as long as it is spaces or special char keep moving left to right
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left))
                != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
