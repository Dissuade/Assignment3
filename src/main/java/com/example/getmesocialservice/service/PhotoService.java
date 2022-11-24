package com.example.getmesocialservice.service;


import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.repoistery.PhotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepo u4;

    public Photo savePhoto(Photo p1) {
        return u4.save(p1);
    }

    public List<Photo> getPhoto() {
        return u4.findAll();
    }

    public Photo updatePhoto(Photo p1) {
        return  u4.save(p1);
    }

    public void deletePhoto(String photoId) {
        u4.deleteById(photoId);
    }
}
