package com.ofe.domain;

import java.util.List;

public class GridBoundaries {

	private int width;
	private int height;
	private List<Movement> obstacles;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public List<Movement> getObstacles() {
		return obstacles;
	}

	public void setObstacles(List<Movement> obstacles) {
		this.obstacles = obstacles;
	}

	public GridBoundaries(int width, int height, List<Movement> obstacles) {
		super();
		this.width = width;
		this.height = height;
		this.obstacles = obstacles;
	}

	public boolean isValid(Movement currentPosition) {
		
		return  currentPosition.x>=0 &&
				currentPosition.y>=0 &&
				currentPosition.x<=width  &&
				currentPosition.y<=height &&
				!obstacles.toString().contains(currentPosition.toString());
	}
}
