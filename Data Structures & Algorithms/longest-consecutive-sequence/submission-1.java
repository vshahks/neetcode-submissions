class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }
        }

        int max = 0;
        int curr_max = 0;

        for(int i : nums){
            if(!set.contains(i-1)){
                int l = 1;
                while(set.contains(i+l)){
                    l++;
                }
                max = Math.max(l,max);
            }
        }
        return max;


    }
}
