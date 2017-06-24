package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Board;
import model.Field.Symbol;

public class ColumnTest {

	 @Test
	    public void firstColumnXWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.X, 0, 0);
	        board.setFieldOwner(Symbol.X, 1, 0);
	        board.setFieldOwner(Symbol.X, 2, 0);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(3, scores[3]);
	    }

	    @Test
	    public void firstColumnOWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.O, 0, 0);
	        board.setFieldOwner(Symbol.O, 1, 0);
	        board.setFieldOwner(Symbol.O, 2, 0);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(-3, scores[3]);
	    }

	    @Test
	    public void secondColumnXWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.X, 0, 1);
	        board.setFieldOwner(Symbol.X, 1, 1);
	        board.setFieldOwner(Symbol.X, 2, 1);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(3, scores[4]);
	    }

	    @Test
	    public void secondColumnOWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.O, 0, 1);
	        board.setFieldOwner(Symbol.O, 1, 1);
	        board.setFieldOwner(Symbol.O, 2, 1);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(-3, scores[4]);
	    }

	    @Test
	    public void thirdColumnXWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.X, 0, 2);
	        board.setFieldOwner(Symbol.X, 1, 2);
	        board.setFieldOwner(Symbol.X, 2, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(3, scores[5]);
	    }

	    @Test
	    public void thirdColumnOWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.O, 0, 2);
	        board.setFieldOwner(Symbol.O, 1, 2);
	        board.setFieldOwner(Symbol.O, 2, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(-3, scores[5]);
	    }
}
