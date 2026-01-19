package com.ofe.domain;

/**
 * Author: @Vinay N
 * 
 * TurnLeft is considering ordinal()+3 because we are making the probe to move
 * always in clockwise direction. We are considering the probe will be placed
 * facing NORTH, so to turn to left, it has to turn EAST - SOUTH - WEST (3)
 * Similarly for turnRight - We can turn the probe from NORTH to EAST (1)
 */
public enum Direction {
	NORTH, EAST, SOUTH, WEST;

	public Direction turnLeft() {
		return values()[(ordinal() + 3) % 4];
	}

	public Direction turnRight() {
		return values()[(ordinal() + 1) % 4];
	}
}
