class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        
        //time O(n^2)
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                
                if( i < j && Math.abs(nums[i] - nums[j]) == k){
                    res += 1;
                }
                
            }
        }
        return res;
        
    }
}
