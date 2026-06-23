class Solution {
    public int[] sortedSquares(int[] nums) {
        // Stores sorted squares
        int[] temp = new int[nums.length];

        // Start pointer
        int left = 0;

        // End pointer
        int right = nums.length - 1;

        // Fill result from the last position
        int index = nums.length - 1;

        while (left <= right) {
            // Square of left element
            int leftSquare = nums[left] * nums[left];

            // Square of right element
            int rightSquare = nums[right] * nums[right];

            // Larger square goes at the end
            if (leftSquare > rightSquare) {
                temp[index] = leftSquare;

                left++;
            } else {
                temp[index] = rightSquare;

                right--;
            }

            index--;
        }

        return temp;
    }
}