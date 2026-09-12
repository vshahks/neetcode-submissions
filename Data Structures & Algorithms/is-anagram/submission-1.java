class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false; 
        Map<Character,Integer> s_set = new HashMap<>();
        Map<Character,Integer> t_set = new HashMap<>();

        for(Character c : s.toCharArray()){
            s_set.put(c,s_set.getOrDefault(c,0) + 1);
        }

        for(Character c : t.toCharArray()){
            t_set.put(c,t_set.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : s_set.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();

            Integer t_value = t_set.get(c);
            if(t_value == null || !t_value.equals(count)){ return false;
            }
        }

        return true;
    }
}
