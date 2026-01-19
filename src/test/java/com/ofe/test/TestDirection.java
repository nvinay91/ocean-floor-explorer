package com.ofe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ofe.domain.Direction;

public class TestDirection {

	@Test
	public void NorthToEastTurn() {
		assertEquals(Direction.EAST, Direction.NORTH.turnRight());
	}
	
	@Test
	public void NorthToWestTurn() {
		assertEquals(Direction.WEST, Direction.NORTH.turnLeft());
	}
}
