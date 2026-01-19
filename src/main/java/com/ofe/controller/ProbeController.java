package com.ofe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofe.dto.RequestObject;
import com.ofe.dto.ResponseObject;
import com.ofe.model.ProbeError;
import com.ofe.service.ProbeService;

@RestController
@RequestMapping("/api/probe/")
public class ProbeController {

	@Autowired
	ResponseObject resObj;

	@Autowired
	ProbeService probeService;
	
	@Autowired
	ProbeError error;
	
	@GetMapping("/execute")
	public ResponseEntity<Object> execute(@RequestBody RequestObject reqMo) {

		try {
			probeService.moveToDestination(reqMo);
		} catch (Exception e) {
			return new ResponseEntity<Object>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Object>(resObj, HttpStatus.OK);
	}
}
