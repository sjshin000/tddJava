package pawn;

import static org.junit.Assert.*;

import org.junit.Test;

public class PawnTest {
	final static String firstPawnColor = "WHITE";
	final static String secondPawnColor = "BLACK";
	
	@Test
	public void test() {
		Pawn firstPawn = new Pawn(firstPawnColor);
		assertEquals("WHITE", firstPawn.isColor());
		
		
		Pawn secondPawn = new Pawn(secondPawnColor);
		assertEquals("BLACK", secondPawn.isColor());
	}

}
