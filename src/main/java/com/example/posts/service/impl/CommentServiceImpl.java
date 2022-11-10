package com.example.posts.service.impl;

import com.example.posts.domain.Comment;
import com.example.posts.repo.CommentRepo;
import com.example.posts.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;


    @Override
    public void save(Comment comment) {
        commentRepo.save(comment);
    }

    public List<Comment> findAll(){
        return commentRepo.findAll();
    }
}
