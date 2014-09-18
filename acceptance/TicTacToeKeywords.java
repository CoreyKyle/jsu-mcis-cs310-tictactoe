import tictactoe.*;
package tictactoe;

public class TicTacToeKeywords {
	TicTacToe t=new TicTacToe();
	private TicTacToe t;
	public void startNewGame(){
		t.startNewGame();
	}
	
	public void markLocation(int row,int col) {
		t.markLocation(row,col);
	}
	
	public String getLocation(int row,int col) {
		return t.getLocation(row,col);
	}
	
	public String getWinner(){
		return t.getWinner();
	}
}
