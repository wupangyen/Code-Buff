class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        // two pointers
        // a pointer start at the start
        // b pointer start at the end 
        // only invert when the two elem are different
        
        for(int i = 0; i < image.length; i++){
            int pointer_a = 0;
            int pointer_b = image[i].length - 1;
            
            while (pointer_a <= pointer_b){
                if( image[i][pointer_a] == image[i][pointer_b]){
                    // trick to invert
                    
                    image[i][pointer_a] = 1 - image[i][pointer_a];
                    image[i][pointer_b] = image[i][pointer_a];
                }
                   pointer_a ++;
                   pointer_b--;
            }
            
         
        }
        
        
        return image;
       
    }
}
