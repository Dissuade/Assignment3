package com.example.getmesocialservice.repoistery;

import com.example.getmesocialservice.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepo extends MongoRepository<Comment,String> {
    }

