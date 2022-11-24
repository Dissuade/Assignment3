package com.example.getmesocialservice.repoistery;

import com.example.getmesocialservice.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepo extends MongoRepository<Album,String> {
}
