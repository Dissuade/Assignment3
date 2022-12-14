package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.repoistery.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService {
    @Autowired
    private CommentRepo ur3;
    public Comment saveComment(Comment c1) {
        return ur3.save(c1);
    }

    public List<Comment> getComment() {
        return ur3.findAll();
    }

    public Comment updateComment(Comment c1) {
        return ur3.save(c1);
    }

    public void deleteComment(String commentId) {
        ur3.deleteById(commentId);
    }
}
