package exam.pawn;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class BoardTest {

	@Test
	public void test() {
		Pawn pawn1 = new Pawn("WHITE");
		Pawn pawn2 = new Pawn("BLACK");
		Board board = new Board();
		ArrayList<Pawn> pawns = new ArrayList<Pawn>();
		
		
		board.enroll(pawn1);
		//pawn�� ������ Ȯ���Ѵ�.
		assertEquals(1, board.getNumberOfPawn());
		board.enroll(pawn2);
		//pawn�� ������ Ȯ���Ѵ�.
		assertEquals(2, board.getNumberOfPawn());
		

	}

}
