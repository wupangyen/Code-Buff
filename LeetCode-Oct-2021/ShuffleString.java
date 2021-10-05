class Solution {
    public String restoreString(String s, int[] indices) {
        
        //time O(n)
        // space O(n)
        
        char[] res = new char[indices.length];
        
        for(int i = 0; i < indices.length; i++){
            
            res[indices[i]] = s.charAt(i);
        }
        
        String shuffle ="";
        
        for(char c: res){
            shuffle += c;
        }
        
        return shuffle;
    }
}
