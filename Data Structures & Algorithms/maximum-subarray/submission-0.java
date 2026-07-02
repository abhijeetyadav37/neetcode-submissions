class Solution {

    public int maxSubArray(int[] nums) {

        // Stores the maximum subarray sum found so far
        int maxSum = Integer.MIN_VALUE;

        // Pick the starting index of the subarray
        for (int start = 0; start < nums.length; start++) {

            // Running sum for the current subarray
            int currentSum = 0;

            // Extend the subarray one element at a time
            for (int end = start; end < nums.length; end++) {

                // Add the current element to the running sum
                currentSum += nums[end];

                // Update the maximum sum if needed
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        // Return the largest subarray sum
        return maxSum;
    }
}