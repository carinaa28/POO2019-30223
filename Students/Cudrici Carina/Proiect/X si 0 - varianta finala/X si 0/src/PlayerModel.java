
public class PlayerModel {

	public static char currentPlayer ='X';
	
 	
	static char makeMove() {
		if (currentPlayer=='X') {
			currentPlayer = 'O' ;
			return currentPlayer;
		}

		currentPlayer =  'X';
		return currentPlayer;
	}
}
