package com.sample.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sample.main.model.CPMR;
@Repository
public interface CPMRRepository extends MongoRepository<CPMR, Integer>{

}
