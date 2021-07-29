package com.sample.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sample.main.model.VRM;

@Repository
public interface VRMRepository extends MongoRepository<VRM, Integer>{

}
