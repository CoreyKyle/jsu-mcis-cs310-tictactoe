package tictactoe;

public class TicTacToe {
    private String[][] board;
	public String player;
	public String winner;

	public void startNewGame() {
		board=new String[3][3];
		player="X";
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				board[i][j]=" ";
			}
		}
	}
	
	public void markLocation(int row,int col){
		if(board[row][col]==" "){
			board[row][col]= player;
			changePlayer();
		}
		
		checkForWin();
	}
	
	public String getLocation(int row,int col) {
		return board[row][col];
	}
	
	public void changePlayer(){
		if(player=="X") {
			player="O";
		}
		else{
			player="X";
		}
	}
	
	public void checkForWin() {
			if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
				winner = getLocation(1,1);
			}
			
			else if(board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
				winner = getLocation(1,1);
			}
			
			else if(board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
				winner = getLocation(2,2);
			}
			
			else if(board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
				winner = getLocation(1,1);
			}
			
			else if(board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
				winner = getLocation(0,0);
			}
			
			else if(board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
				winner = getLocation(0,0);
			}
			
			else if(board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
				winner = getLocation(1,1);
			}
			
			else if(board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
				winner = getLocation(2,2);
			}
			
			else {
				winner = "TIE";
			}
			
	}
	
	public String getWinner() {
		return winner;
	}
}
