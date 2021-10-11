class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String s1;
        String s2;
        
        s1 = concate(word1);
        s2 = concate(word2);
        
        return s1.equals(s2);
        
    }
    
    public String concate(String[] s){
        String res ="";
        for(String str:s){
            res+= str;
        }
        return res;
    }
}
