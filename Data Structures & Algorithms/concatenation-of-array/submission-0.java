class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int temp[] = new int[nums.length*2];
        int index=0;

        for(int num :  nums){
            temp[index] = num;
            index++;
        }

         for(int num :  nums){
            temp[index] = num;
            index++;
        }

        return temp;
        
    }
}