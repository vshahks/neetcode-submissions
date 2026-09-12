class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int curr_max = 0;
        for(int i : nums){
            if(i == 1){
                curr_max +=1;
                max = Math.max(max,curr_max);
            } else{
                curr_max =0;
            }
        }
        return max;
    }
}