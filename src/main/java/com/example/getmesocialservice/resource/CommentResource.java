package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentResource {
    @Autowired
    private CommentService crs;
    @PostMapping()
    public Comment saveComment(@RequestBody Comment c1)
    {
        return crs.saveComment(c1);

    }
    @GetMapping()
    public List<Comment> getComment()
    {
        return crs.getComment();

    }
    @PutMapping()
    public Comment updateComment(@RequestBody Comment c1)
    {

        return crs.updateComment(c1);
    }
    @DeleteMapping()
    public void deleteComment(@RequestParam(name="commentId")String commentId)
    {
        crs.deleteComment(commentId);

    }
}
