package com.tatatrent.cyclecount.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tatatrent.cyclecount.rest.dto.Message;
import com.tatatrent.cyclecount.rest.dto.RequestDto;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/trent_api/v1/process_cycle_count")
public class RestController {
	
	
	
	@RequestMapping(value = "/message", method = RequestMethod.GET, produces = {"application/json"})
	public ResponseEntity<Message> getMessage() {
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/process_count", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public ResponseEntity<RequestDto> processCount(@RequestBody RequestDto dto) {
		return new ResponseEntity<RequestDto>(dto, HttpStatus.CREATED);
	}


}
