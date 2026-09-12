class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(int i : nums){
            int currFreq = map.getOrDefault(i,0) + 1;
            map.put(i,currFreq);
            maxFreq = Math.max(maxFreq,currFreq);
        }

        List<List<Integer>> buckets = new ArrayList<>(maxFreq + 1);
        for (int i = 0; i <= maxFreq; i++) {
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int currFreq = entry.getValue();
            List<Integer> currFreqList = buckets.get(currFreq);
            currFreqList.add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;

        for (int frequency = maxFreq; frequency >= 1 && index < k; frequency--) {
            for (int num : buckets.get(frequency)) {
                result[index] = num;
                index++;

                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
}
