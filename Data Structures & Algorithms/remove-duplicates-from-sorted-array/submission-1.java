class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                continue;
            } else {
                map.put(nums[i], i);
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}