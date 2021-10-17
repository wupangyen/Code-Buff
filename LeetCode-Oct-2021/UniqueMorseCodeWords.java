class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        HashSet<String> set = new HashSet<String>();
        
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String s: words){
            
            StringBuilder sb = new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(morseCode[c-'a']);
                
                
            }
            set.add(sb.toString());
        }
        
        
        
        return set.size();
        
    }
}
