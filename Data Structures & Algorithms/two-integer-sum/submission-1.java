class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i = 0;i<nums.length;i++){
            int remaining = target- nums[i];

            Integer s = map.get(remaining);

            if(s!= null && i !=s){
                return new int[]{Math.min(i,s),Math.max(i,s)};
            }
        }
    return new int[]{-1,-1};
    }
}
