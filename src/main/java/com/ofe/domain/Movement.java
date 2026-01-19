package com.ofe.domain;

import org.springframework.stereotype.Component;

/**
 * Author: @Vinay N Description: In this class we are setting the coordinates
 * where it has to move.
 */
public class Movement {

	public int x;
	public int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Movement(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Movement move(Direction direction) {

		return switch (direction) {
		case NORTH -> new Movement(x, y + 1);
		case EAST -> new Movement(x + 1, y);
		case SOUTH -> new Movement(x, y - 1);
		case WEST -> new Movement(x - 1, y);
		};
	}

	@Override
	public String toString() {
		return "Movement [x=" + x + ", y=" + y + "]";
	}

}
