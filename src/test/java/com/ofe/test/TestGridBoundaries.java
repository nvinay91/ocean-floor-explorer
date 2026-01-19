package com.ofe.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.ofe.domain.GridBoundaries;
import com.ofe.domain.Movement;

public class TestGridBoundaries {

	@Test
	public void isProbeInValidPosition() {
		GridBoundaries boundaries = new GridBoundaries(3, 3, Arrays.asList());
		Movement currPosition = new Movement(2, 2);
		assertTrue(boundaries.isValid(currPosition));
	}
	
	@Test
    public void obstaclePositionIsInvalid() {
		GridBoundaries boundaries = new GridBoundaries(5,5, Arrays.asList(new Movement(2,2)));
		Movement currPosition = new Movement(2, 2);
        assertFalse(boundaries.isValid(currPosition));
    }
}
