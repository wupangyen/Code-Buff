class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        
        for(char c : allowed.toCharArray()){
            set.add(c);
            
        }
        
        for(String s:words){
            for(int i = 0; i < s.length(); i++){
            
            if(!set.contains(s.charAt(i))){
                break;
            }
            if(i == s.length() - 1){
                count += 1;
            }
            
            }
        }
        
        return count;
        
    }
}
