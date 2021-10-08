class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count = 0;
        // run time complexity O(n)
        // space O(1)
        
        for(List<String> l: items){
            String type = l.get(0);
            String color = l.get(1);
            String name = l.get(2);
            
            if(ruleKey.equals("type") && type.equals(ruleValue) || ruleKey.equals("color") && color.equals(ruleValue)|| ruleKey.equals("name") && ruleValue.equals(name)){
                count += 1;
            }
            
            
        }
        return count;
        
    }
}
