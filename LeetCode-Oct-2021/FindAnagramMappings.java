public class Solution {
    /**
     * @param A: lists A
     * @param B: lists B
     * @return: the index mapping
     */
    public int[] anagramMappings(int[] A, int[] B) {
        // Write your code here
        // time O(n)
        // space O(n)
        int[] p = new int[A.length];

        List<Integer> listB = new ArrayList<Integer>();

        for(int b:B){
            listB.add(b);
        }
        for(int i = 0; i < A.length; i++){
            p[i] = listB.indexOf(A[i]);

        }
        return p;
    }
}
