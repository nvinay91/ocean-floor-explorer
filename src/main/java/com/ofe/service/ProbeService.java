package com.ofe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofe.domain.Direction;
import com.ofe.domain.GridBoundaries;
import com.ofe.domain.Movement;
import com.ofe.dto.RequestObject;
import com.ofe.dto.ResponseObject;
import com.ofe.model.ProbeError;

@Service
public class ProbeService {

	Direction direction;
	
	Movement movement;
	
	GridBoundaries grid;
	
	@Autowired
	ResponseObject resObj;
	
	@Autowired
	ProbeError error;
	
	
	public ResponseObject moveToDestination(RequestObject reqMo) throws Exception {
		
		movement = new Movement(reqMo.getStart().x,reqMo.getStart().y);
		grid = new GridBoundaries(reqMo.getGrid().getWidth(),reqMo.getGrid().getHeight(),reqMo.getGrid().getObstacles());
		direction = Direction.values()[0];
		
		if(resObj == null) {
			resObj = new ResponseObject();
			error = new ProbeError();
		}
		
		for(char command : reqMo.getCommand().toCharArray()) {
			switch(command) {
			case 'L' -> direction=direction.turnLeft();
			case 'R' -> direction=direction.turnRight();
			case 'F' -> movement=move(true);
			case 'B' -> movement=move(false);
			}
		}
		return resObj;
	}

	private Movement move(boolean flag) throws Exception {
		if(flag) {
			movement = movement.move(direction);
		}else {
			movement = movement.move(direction.turnLeft().turnLeft());
		}
		
		if(grid.isValid(movement)) {
			resObj.getVisited().add(movement);
			resObj.setObstacleHit(false);
			resObj.setFinalPosition(movement);
		}else {
			error.setErrorId("Err-1");
			error.setErrorDesc("Grid Validation Failed - Either Obstacle / Out of Grid Exception");
			error.setSeverity("4");
			throw new RuntimeException("Grid Validation Failed - Either Obstacle / Out of Grid Exception");
		}
		return movement;
	}

}
