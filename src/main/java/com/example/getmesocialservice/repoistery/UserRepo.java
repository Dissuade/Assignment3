package com.example.getmesocialservice.repoistery;

import com.example.getmesocialservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends MongoRepository <User,String>{

    List<User> findAllByAddress(String address);
}
