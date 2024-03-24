package com.sm.wr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name="sm_state_master")
public class StateMaster {
	
	@Id
	private Integer stateId;
	
	private String stateCode;
	
	private String stateName;
	

}
