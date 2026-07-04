class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        for (int r = 0; r < k; r++) {

            int last = nums[n - 1];

            // Shift elements one step right
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }

            nums[0] = last;
        }
    }
}