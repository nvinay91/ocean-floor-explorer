package com.ofe.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ofe.domain.Movement;

@Component
public class ResponseObject  implements Serializable {

	private Movement finalPosition;

	private List<Movement> visited = new ArrayList<Movement>();

	private boolean obstacleHit;

	public Movement getFinalPosition() {
		return finalPosition;
	}

	public void setFinalPosition(Movement finalPosition) {
		this.finalPosition = finalPosition;
	}

	public List<Movement> getVisited() {
		return visited;
	}

	public void setVisited(List<Movement> visited) {
		this.visited = visited;
	}

	public boolean isObstacleHit() {
		return obstacleHit;
	}

	public void setObstacleHit(boolean obstacleHit) {
		this.obstacleHit = obstacleHit;
	}

}
