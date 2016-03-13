package pawn;

import java.util.ArrayList;

public class Board {
	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	private int numberOfPawn = 0;

	public ArrayList<Pawn> getPawns() {
		return pawns;
	}

	public void setPawns(ArrayList<Pawn> pawns) {
		this.pawns = pawns;
	}

	public void enroll(Pawn pawn) {
		pawns.add(pawn);
		numberOfPawn++;
	}
	
	public int getNumberOfPawn() {
		return numberOfPawn;
	}
	
}
