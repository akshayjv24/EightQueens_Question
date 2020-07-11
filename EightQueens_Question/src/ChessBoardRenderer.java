public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		System.out.println(square);
		if((square/8)%2==0){//Check for odd/even row
			if(square%2==0){//Check if element in odd/even position
				return false;
			}
		}
		else {
			if(square%2!=0)	
				return false;
		}
		return true;
	}
}
