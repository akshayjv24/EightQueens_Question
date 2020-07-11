public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................	
		int column;
		column = cellId%8;
		//System.out.println("CellID:"+cellId);

		return column;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int row;
		row = cellId/8;
		
		return row;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		 for (int i = 0; i < 8; i++) 
	            if (placedQueens[row][i]) 
	            	isValid = false; 
		 for (int i = 0; i < 8; i++) 
	            if (placedQueens[i][col]) 
	            	isValid = false; 
	  
	        /* Check upper diagonal on left side */
	        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) 
	            if (placedQueens[i][j]) 
	            	isValid = false; 
	  
	        /* Check lower diagonal on left side */
	        for (int i = row, j = col; j >= 0 && i < 8; i++, j--) 
	            if (placedQueens[i][j]) 
	                isValid = false; 
	        /* Check upper diagonal on right side */
	        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) 
	            if (placedQueens[i][j]) 
	            	isValid = false; 
	  
	        /* Check lower diagonal on right side */
	        for (int i = row, j = col; j <8 && i < 8; i++, j++) 
	            if (placedQueens[i][j]) 
	                isValid = false; 
	        if(isValid) {
	        	placedQueens[row][col] = true;
		        numQueens++;
	        }
	        
	        return isValid;
	}
}














