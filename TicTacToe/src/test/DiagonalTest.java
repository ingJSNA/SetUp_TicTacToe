package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Board;
import model.Field.Symbol;

public class DiagonalTest {

	@Test
    public void leftToRightDiagonalXWins() {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 0, 0);
        board.setFieldOwner(Symbol.X, 1, 1);
        board.setFieldOwner(Symbol.X, 2, 2);

        int[] scores = board.evaluateBoard();
        assertEquals(3, scores[6]);
    }

    @Test
    public void leftToRightDiagonalOWins() {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 0);
        board.setFieldOwner(Symbol.O, 1, 1);
        board.setFieldOwner(Symbol.O, 2, 2);

        int[] scores = board.evaluateBoard();
        assertEquals(-3, scores[6]);
    }

    @Test
    public void rightToLeftDiagonalXWins() {
        Board board = new Board();            
        
        board.setFieldOwner(Symbol.X, 0, 2);
        board.setFieldOwner(Symbol.X, 1, 1);
        board.setFieldOwner(Symbol.X, 2, 0);
        
        int[] scores = board.evaluateBoard();
        assertEquals(3, scores[7]);
    }
    
    @Test
    public void rightToLeftDiagonalXWins2() {
        Board board = new Board();               
        
        board.setFieldOwner(Symbol.X, 0, 0);
        board.setFieldOwner(Symbol.O, 0, 1);
        board.setFieldOwner(Symbol.O, 1, 0);
        board.setFieldOwner(Symbol.O, 1, 2);
        
        board.setFieldOwner(Symbol.X, 0, 2);
        board.setFieldOwner(Symbol.X, 1, 1);
        board.setFieldOwner(Symbol.X, 2, 0);
        
        //board.printField();
        int[] scores = board.evaluateBoard();
        assertEquals(3, scores[7]);                
    }

    @Test
    public void rightToLeftDiagonalOWins() {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 2);
        board.setFieldOwner(Symbol.O, 1, 1);
        board.setFieldOwner(Symbol.O, 2, 0);

        int[] scores = board.evaluateBoard();
        assertEquals(-3, scores[7]);
    }
    
    @Test
    public void rightToLeftDiagonalOWins2() {
        Board board = new Board();               
        
        board.setFieldOwner(Symbol.O, 0, 0);
        board.setFieldOwner(Symbol.X, 0, 1);
        board.setFieldOwner(Symbol.X, 1, 0);
        board.setFieldOwner(Symbol.X, 1, 2);
        
        board.setFieldOwner(Symbol.O, 0, 2);
        board.setFieldOwner(Symbol.O, 1, 1);
        board.setFieldOwner(Symbol.O, 2, 0);
        
        //board.printField();
        int[] scores = board.evaluateBoard();
        assertEquals(-3, scores[7]);                
    }

}
