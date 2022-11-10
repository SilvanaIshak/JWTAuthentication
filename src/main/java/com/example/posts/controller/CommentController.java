/*
package com.example.posts.controller;


import com.example.posts.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comment")
@RequiredArgsConstructor
public class CommentController {

    @Autowired
    CommentService commentService;


    @GetMapping
    public List<Comment> findAll(){
       return commentService.findAll();
    }

    @PostMapping
    public void create(@RequestBody Comment comment) {
        commentService.save(comment);
    }
}
*/
