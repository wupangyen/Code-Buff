// brute force
class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int res = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                
                if(i < j && nums[i] == nums[j]){
                    res +=1;
                }
            }
            
        }
        
        return res;
        
    }
}

// O(n) time complexity 
// use combinatorics 

class Solution {
    public int numIdenticalPairs(int[] nums) {
        // time O(n)
        // space O(1)
        int res = 0;
        int[] freq = new int [101];
        
        for(int i = 0; i < nums.length; i++){
            
            freq[nums[i]] ++;
        }
        
        for(int f: freq){
            res += comb(f);
        }
        
        return res;
        
        
    }
    
    public int comb(int freq){
        int res = 0;
        
        res = ((freq -1) * freq)/2;
        
        return res;
    }
}
