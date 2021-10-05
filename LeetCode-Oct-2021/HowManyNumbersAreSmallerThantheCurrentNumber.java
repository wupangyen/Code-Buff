// time O(n)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        
        int[] freq = new int[101];
        // freq 
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]] ++;
        }
        //runningSum
        for(int i = 1; i < 101; i++){
            freq[i] += freq[i-1];
        }
        
        for(int i = 0; i < nums.length; i++){
            int position = nums[i];
            if(position == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = freq[position - 1];
            }
        }
        return nums;
    }
}

//time O(n^2)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i]){
                    res[i] += 1;
                }
                
            }
        }
        return res;
    }
}
