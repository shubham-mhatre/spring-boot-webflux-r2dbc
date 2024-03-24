package com.sm.wr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.wr.model.StateMaster;
import com.sm.wr.repository.StateMasterRepository;

import reactor.core.publisher.Flux;

@Service
public class WebService {
	
	@Autowired private StateMasterRepository stateMasterRepo;
	
	public Flux<StateMaster> getAllStateList(){
		return stateMasterRepo.findAll();
	}

}
