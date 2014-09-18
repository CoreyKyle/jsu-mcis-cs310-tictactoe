
package tictactoe;
import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void testCenter(){
        TicTacToe t=new TicTacToe();
		t.startNewGame();
		t.markLocation(1,1);
		assertEquals("X",t.getLocation(1,1));
    }
    
    @Test
    public void testStartNewGame(){
        TicTacToe t=new TicTacToe();
		t.startNewGame();
		t.markLocation(2,1);
		assertEquals("X",t.getLocation(2,1));
    }

	@Test
	public void testChangePlayer(){
		TicTacToe t=new TicTacToe();
		t.startNewGame();
		t.markLocation(1,1);
		t.markLocation(0,0);
		assertEquals("0",t.getLocation(0,0));
		t.markLocation(2,2);
		assertEquals("X",t.getLocation(2,2));
	}
	
	@Test
	public void testForTie(){
		TicTacToe t=new TicTacToe();
		t.startNewGame();
		t.GetLocation(1,1);
		t.GetLocation(0,0);
		t.GetLocation(2,0);
		t.GetLocation(0,2);
		t.GetLocation(0,1);
		t.GetLocation(2,1);
		t.GetLocation(1,2);
		t.GetLocation(1,0);
		t.GetLocation(2,2);
		t.checkforWin();
		assertEquals("TIE",t.getWinner());
	}
	
	@Test
	public void testDiagonalWinRight() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(0,2);
		t.markLocation(0,1);
		t.markLocation(1,1);
		t.markLocation(2,2);
		t.markLocation(2,0);
		t.checkForWin();
		assertEquals("X", t.getWinner());
	}
	
	@Test
	public void testDiagonalWinLeft() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(0,0);
		t.markLocation(0,1);
		t.markLocation(1,1);
		t.markLocation(0,2);
		t.markLocation(2,2);
		t.checkForWin();
		assertEquals("X", t.getWinner());
	}
	
	@Test 
	public void testHorizontalWinTop() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(2,2);
		t.markLocation(0,2);
		t.markLocation(1,0);
		t.markLocation(0,1);
		t.markLocation(2,1);
		t.markLocation(0,0);
		t.checkForWin();
		assertEquals("O", t.getWinner());
	}
	
	@Test
	public void testHorizontalWinBottom() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(1,1);
		t.markLocation(2,0);
		t.markLocation(0,0);
		t.markLocation(2,2);
		t.markLocation(0,2);
		t.markLocation(2,1);
		t.checkForWin();
		assertEquals("O", t.getWinner());
	}
	
	@Test
	public void testHorizontalWinMiddle() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(0,0);
		t.markLocation(1,1);
		t.markLocation(2,2);
		t.markLocation(1,2);
		t.markLocation(0,1);
		t.markLocation(1,0);
		t.checkForWin();
		assertEquals("O", t.getWinner());
	}
	
	@Test
	public void testVerticalWinRight() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(0,2);
		t.markLocation(0,0);
		t.markLocation(2,2);
		t.markLocation(2,0);
		t.markLocation(1,2);
		t.markLocation(1,1);
		t.checkForWin();
		assertEquals("X", t.getWinner());
	}
	
	@Test
	public void testVerticalWinLeft() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(0,0);
		t.markLocation(1,1);
		t.markLocation(1,0);
		t.markLocation(2,2);
		t.markLocation(2,0);
		t.checkForWin();
		assertEquals("X", t.getWinner());
	}
	
	@Test
	public void testVerticalWinMiddle() {
		TicTacToe t= new TicTacToe();
		t.startNewGame();
		t.markLocation(2,2);
		t.markLocation(0,1);
		t.markLocation(0,0);
		t.markLocation(1,1);
		t.markLocation(1,0);
		t.markLocation(2,1);
		t.checkForWin();
		assertEquals("O", t.getWinner());
	}
}
