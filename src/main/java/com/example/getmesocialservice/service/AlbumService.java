package com.example.getmesocialservice.service;




import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repoistery.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepo ur2;
    public Album saveAlbum(Album al) {
        return ur2.save(al);
    }

    public List<Album> getAlbum() {
        return ur2.findAll();
    }

    public Album updateAlbum(Album al) {
        return ur2.save(al);
    }

    public void deleteAlbum(String albumId) {
        ur2.deleteById(albumId);
    }
}


