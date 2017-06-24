package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Board;
import model.Field.Symbol;

public class RowTest {
	
	 @Test
	    public void firstRowXWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.X, 0, 0);
	        board.setFieldOwner(Symbol.X, 0, 1);
	        board.setFieldOwner(Symbol.X, 0, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(3, scores[0]);        
	    }
	 
	 @Test
	    public void firstRowOWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.O, 0, 0);
	        board.setFieldOwner(Symbol.O, 0, 1);
	        board.setFieldOwner(Symbol.O, 0, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(-3, scores[0]);
	    }

	    @Test
	    public void secondRowXWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.X, 1, 0);
	        board.setFieldOwner(Symbol.X, 1, 1);
	        board.setFieldOwner(Symbol.X, 1, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(3, scores[1]);
	    }

	    @Test
	    public void secondRowOWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.O, 1, 0);
	        board.setFieldOwner(Symbol.O, 1, 1);
	        board.setFieldOwner(Symbol.O, 1, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(-3, scores[1]);
	    }

	    @Test
	    public void thirdRowXWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.X, 2, 0);
	        board.setFieldOwner(Symbol.X, 2, 1);
	        board.setFieldOwner(Symbol.X, 2, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(3, scores[2]);
	    }

	    @Test
	    public void thirdRowOWins() {
	        Board board = new Board();

	        board.setFieldOwner(Symbol.O, 2, 0);
	        board.setFieldOwner(Symbol.O, 2, 1);
	        board.setFieldOwner(Symbol.O, 2, 2);

	        int[] scores = board.evaluateBoard(); 
	        assertEquals(-3, scores[2]);
	    }
}
