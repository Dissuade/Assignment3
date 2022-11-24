package com.example.getmesocialservice.repoistery;

import com.example.getmesocialservice.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepo extends MongoRepository<Photo,String> {
}
