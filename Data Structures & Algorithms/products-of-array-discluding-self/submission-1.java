class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] postProduct = new int[n];
        postProduct[n-1] = 1;
        for(int i = n-2;i>=0;i--){
            postProduct[i] = postProduct[i+1] * nums[i+1];
        }

        int[] preProduct = new int[n];
        preProduct[0] = 1;
        for(int i = 1;i < n;i++){
            preProduct[i] = preProduct[i-1] * nums[i-1];
        }

        int[] result = new int[n];
        for(int i = 0;i < n;i++){
            result[i] = postProduct[i] * preProduct[i];
        }

        return result;
    }
}  
