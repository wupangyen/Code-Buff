class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        
        int[][] grid = buildGrid(n,mines);
        
        
        //lTr grid
        int[][] lTr =lToR(n,grid);
        // rTl gird
        int[][] rTl = rToL(n,grid);
        //tToB grid
        int[][] tTb = tToB(n,grid);
        //bTot grid
        
        int[][] bTt = bToT(n,grid);
        
        
        int ans = 0;
        
        // find the min out of 4 grid 
        // and keep the max
        
        // loop through the 4 grid
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                int minLen = Math.min(Math.min(lTr[i][j],rTl[i][j]),Math.min(tTb[i][j],bTt[i][j]));
                ans = Math.max(ans,minLen);
            }
        }
        
        return ans;
    
 
    }
    
    
    // bottom to top grid
	
	public static int[][] bToT(int n, int[][]grid){
		
		// init 2d array tTb
		int[][] bTt = new int[n][n];
		
		// iterate through grid from top to bottom
		for(int i = 0; i < n; i++) {
			//init runningSum
			int runningSum = 0;
			for(int j = n -1 ; j >=0; j--) {
				if(grid[j][i] == 0) {
    				runningSum = 0;
    			}
				else {
					runningSum = runningSum + grid[j][i];
					
				}
				
    			
    			
    			bTt[j][i] = runningSum;
				
			}
		}
		return bTt;
		
	}
    
	// top to bottom grid
	
	public static int[][] tToB(int n, int[][]grid){
		
		// init 2d array tTb
		int[][] tTb = new int[n][n];
		
		// iterate through grid from top to bottom
   for(int i=0;i<n;i++){
            int runningSum = 0;
            for(int j=0;j<n;j++){
                if(grid[j][i] == 0){
                    runningSum = 0;
                } else {
                    runningSum = grid[j][i]+runningSum;
                }

                tTb[j][i]  = runningSum;
            }
        }
		return tTb;
		
	}
    // Right to left
	    public  int[][] rToL(int n,int[][] grid){
	    
	    	// init new 2d array rTl
	    	int[][] rTl = new int[n][n];
	    	
	    	// iterate through grid from r to l	
	   for(int i=0;i<n;i++){
            int runningSum = 0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j] == 0){
                    runningSum = 0;
                } else {
                    runningSum = grid[i][j]+runningSum;
                }
                rTl[i][j] = runningSum;
            }
        }
	    	return rTl;
	    }
    
    
    
    
    
    public int[][] buildGrid(int n, int[][] mines){
        
        // create an given n * n grid 
        
        int[][] grid = new int[n][n];
        // init grid with all ones
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = 1;
            }
        }
        // where mines are we replace it to 0
        // iterate through mines
        
        for(int i = 0; i < mines.length; i ++){
            
                int row = mines[i][0];
                    
                int column = mines[i][1];
                grid[row][column] = 0;
            
        }
        return grid;
 
    }
    public int[][] lToR(int n, int[][] grid){
        // iterate through grid

        
        int currRow = 0;
        
        // init new grid lTr
        int[][] lTr = new int[n][n];
        for(int i=0;i<n;i++){
            int runningSum = 0;
            for(int j=0;j<n;j++){

                if(grid[i][j] == 0){
                    runningSum = 0;
                } else {
                    runningSum = grid[i][j]+runningSum;
                }

                lTr[i][j]  = runningSum;
            }
        }
        return lTr;
    }
    
}
