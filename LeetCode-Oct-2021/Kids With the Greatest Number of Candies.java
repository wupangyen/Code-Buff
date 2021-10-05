
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        // time O(n)
        //space O(n)
        
        int max = 0;;
        List<Boolean> res = new ArrayList<Boolean>();
        
        for(int candy: candies){
            max = Math.max(max,candy);
        }
        
        
        for(int candy: candies){
            if(candy + extraCandies >= max){
                res.add(true);
            }
            else{
                res.add(false);
            }
            
        }
        
        return res;
        
    }
}
