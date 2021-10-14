class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] words = s.split(" ");
        
        String res = "";
        
        for(int i = 0; i < k; i++){
            
            res += words[i] + " ";
        }
        res = res.substring(0,res.length()-1);
        
        return res;
        
    }
}
