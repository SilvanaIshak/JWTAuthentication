package com.example.posts.service;

import com.example.posts.domain.Comment;

import java.util.List;

public interface CommentService {

    void save(Comment comment);

    List<Comment> findAll();
}
