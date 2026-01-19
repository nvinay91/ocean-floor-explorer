package com.ofe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.ofe.domain.GridBoundaries;
import com.ofe.domain.Movement;
import com.ofe.dto.RequestObject;
import com.ofe.dto.ResponseObject;
import com.ofe.model.ProbeError;
import com.ofe.service.ProbeService;

public class ProbeServiceTest {

	@Test
	public void checkProbeMovementWithoutObstacle() {

		GridBoundaries grid = new GridBoundaries(5, 5, Arrays.asList(new Movement(2, 2), new Movement(4, 3)));
		Movement movement = new Movement(0, 0);
		String command = "RFFFFFLFFFFF";
		ResponseObject resObj = new ResponseObject();

		ProbeService pservice = new ProbeService();
		RequestObject reqMo = new RequestObject();
		reqMo.setCommand(command);
		reqMo.setGrid(grid);
		reqMo.setStart(movement);
		
		
		try {
			resObj = pservice.moveToDestination(reqMo);
			assertEquals(new Movement(5, 5).toString(), resObj.getFinalPosition().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void checkProbeMovementWithObstacle() {

		GridBoundaries grid = new GridBoundaries(5, 5, Arrays.asList(new Movement(2, 2), new Movement(4, 3)));
		Movement movement = new Movement(0, 0);
		String command = "FRFFLF";
		ResponseObject resObj = new ResponseObject();

		ProbeService pservice = new ProbeService();
		RequestObject reqMo = new RequestObject();
		reqMo.setCommand(command);
		reqMo.setGrid(grid);
		reqMo.setStart(movement);
		
		
		try {
			resObj = pservice.moveToDestination(reqMo);
		} catch (Exception e) {
			assertEquals("Grid Validation Failed - Either Obstacle / Out of Grid Exception",e.getMessage());
		}
	}
}
