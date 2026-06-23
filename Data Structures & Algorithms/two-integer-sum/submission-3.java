// optimal using hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needNum = target - nums[i];

            if (map.containsKey(needNum)) {
                return new int[] {
                    map.get(needNum), i};
                
            } else {
                map.put(nums[i], i);
            }
        }
        return new int []{};
    }
}
