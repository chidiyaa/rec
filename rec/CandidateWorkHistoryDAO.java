package com.example.Recruitiment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateWorkHistoryDAO extends MongoRepository<CandidateWorkHistory,String>{

}
