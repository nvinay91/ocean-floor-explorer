package com.ofe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ofe.domain.Direction;
import com.ofe.domain.Movement;

public class TestMovement {

	public void moveToNorthByIncreasingYCoordinateBy1() {
		Movement start = new Movement(0, 0);
		Movement end = start.move(Direction.NORTH);
		assertEquals(new Movement(0, 1), end.toString());
	}

	public void moveToSouthByDecreasingYCoordinateBy1() {
		Movement start = new Movement(0, 0);
		Movement end = start.move(Direction.SOUTH);
		assertEquals(new Movement(0, -1), end.toString());
	}

	public void moveToEastByIncreasingXCoordinateBy1() {
		Movement start = new Movement(0, 0);
		Movement end = start.move(Direction.EAST);
		assertEquals(new Movement(1, 0), end.toString());
	}
	
	public void moveToWestByDecreasingXCoordinateBy1() {
		Movement start = new Movement(0, 0);
		Movement end = start.move(Direction.WEST);
		assertEquals(new Movement(-1, 0), end.toString());
	}
}
