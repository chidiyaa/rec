package com.example.Recruitiment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlacedCandidatesDAO extends MongoRepository<PlacedCandidates,String>{

}
