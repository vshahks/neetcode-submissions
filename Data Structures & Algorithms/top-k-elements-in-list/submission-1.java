class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(int i : nums){
            int currFreq = map.getOrDefault(i,0) + 1;
            map.put(i,currFreq);
            maxFreq = Math.max(maxFreq,currFreq);
        }

        
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            queue.offer(new int[]{entry.getKey(),entry.getValue()});

            if(queue.size() > k){
                queue.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;

    
    }
}
