class Solution {

    public int maxSubArray(int[] nums) {

        // Sum of the current subarray
        int currentSum = nums[0];

        // Maximum subarray sum found so far
        int maxSum = nums[0];

        // Traverse from the second element
        for (int i = 1; i < nums.length; i++) {

            // Either start a new subarray
            // OR extend the previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maximum answer
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}