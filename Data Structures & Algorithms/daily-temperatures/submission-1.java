class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        // Result array
        int[] ans = new int[temperatures.length];

        // Check every day's temperature
        for (int i = 0; i < temperatures.length; i++) {

            // Default answer is 0
            // (means no warmer day found)
            ans[i] = 0;

            // Check all future days
            for (int j = i + 1; j < temperatures.length; j++) {

                // Found a warmer temperature
                if (temperatures[j] > temperatures[i]) {

                    // Store how many days we waited
                    ans[i] = j - i;

                    // Stop because we only need the FIRST warmer day
                    break;
                }
            }
        }

        // Return final answer
        return ans;
    }
}