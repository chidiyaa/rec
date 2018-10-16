package com.example.Recruitiment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidatePersonalDAO extends MongoRepository<CandidatePersonal, String>{

}
