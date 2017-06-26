/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Board;
import model.Field.Symbol;

/**
 * @author juan
 *
 */
public class BoardTest {

	@Test
	public void newBoard() {
		Board board = new Board();
		int[] scores = board.evaluateBoard();
		
		for (int score : scores) {
			assertEquals(0, score);
		}
	}
	
	@Test
	public void winningBoard() {
		Board board = new Board();
		
		board.setFieldOwner(Symbol.X, 0, 0);
		board.setFieldOwner(Symbol.O, 2, 2);
		board.setFieldOwner(Symbol.X, 0, 2);
		board.setFieldOwner(Symbol.O, 0, 1);
		board.setFieldOwner(Symbol.X, 2, 0);
		board.setFieldOwner(Symbol.O, 1, 1);
		board.setFieldOwner(Symbol.X, 1, 0);
		
		int[] scores = board.evaluateBoard();
		
			assertEquals(3, scores[3]);
		
	}

}
