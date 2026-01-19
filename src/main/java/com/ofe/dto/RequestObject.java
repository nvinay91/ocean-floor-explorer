package com.ofe.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.ofe.domain.Direction;
import com.ofe.domain.GridBoundaries;
import com.ofe.domain.Movement;

@Component
public class RequestObject implements Serializable {

	private GridBoundaries grid;

	private Movement start;

	private String command;

	public GridBoundaries getGrid() {
		return grid;
	}

	public void setGrid(GridBoundaries grid) {
		this.grid = grid;
	}

	public Movement getStart() {
		return start;
	}

	public void setStart(Movement start) {
		this.start = start;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
}
