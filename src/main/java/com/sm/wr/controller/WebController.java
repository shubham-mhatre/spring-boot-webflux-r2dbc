package com.sm.wr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.wr.model.StateMaster;
import com.sm.wr.service.WebService;

import reactor.core.publisher.Flux;

@RestController
public class WebController {
	
	final private WebService webService;
	@Autowired
	public WebController( WebService webService) {
		this.webService=webService;
	}
	
	@GetMapping
	public Flux<StateMaster> getAllStates(){
		return webService.getAllStateList();
	}

}
