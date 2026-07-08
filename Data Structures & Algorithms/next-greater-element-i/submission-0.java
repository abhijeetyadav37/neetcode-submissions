// brute force
// stack
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Result array to store the answers
        int[] ans = new int[nums1.length];

        // Traverse every element of nums1
        for (int i = 0; i < nums1.length; i++) {

            // Default answer is -1
            ans[i] = -1; // ans ka ith index mein 

            // Variable to store where nums1[i] is found in nums2
            int index = -1; //-1 coz it not valid index 

            // Find nums1[i] inside nums2
            for (int j = 0; j < nums2.length; j++) {

                // Element found
                if (nums2[j] == nums1[i]) {
                    index = j; // index where num1 is found in num2
                    break; // No need to search further
                }
            }

            // Check every element on the RIGHT side
            for (int j = index + 1; j < nums2.length; j++) {

                // First greater element found
                if (nums2[j] > nums1[i]) {

                    // Store answer
                    ans[i] = nums2[j];

                    // Stop because we only need FIRST greater
                    break;
                }
            }
        }

        // Return final answers
        return ans;
    }
}