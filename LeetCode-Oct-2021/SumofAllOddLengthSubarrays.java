class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        // time O(n^2)
        //space O(1)
        
        int len = arr.length;
        int total = 0;
        
        for(int i =  0 ; i < len; i = i + 2){
            for(int j = 0; j < len; j++){
                
                if( i + j < len){
                    for(int k = 0; k <= i; k++){
                        total += arr[j+k];
                    }
                }
                
            }
            
        }
        return total;
        
    }
}
