class Solution {
    public int maxProductDifference(int[] nums) {
        
        // time O(nlogn)
        Arrays.sort(nums);
        
        // get the larger pair 
        int a = nums[nums.length - 1];
        int b = nums[nums.length - 2];
        
        // get the smaller pair
        
        int c = nums[0];
        int d = nums[1];
        
        return (a* b) - (c*d);
        
        
    }
}
