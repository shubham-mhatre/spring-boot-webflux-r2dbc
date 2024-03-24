package com.sm.wr.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.sm.wr.model.StateMaster;

@Repository
public interface StateMasterRepository extends R2dbcRepository<StateMaster, Integer>{

}
