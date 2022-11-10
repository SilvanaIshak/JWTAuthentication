package com.example.posts.service;

import com.example.posts.domain.Comment;
import com.example.posts.domain.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();

    void deleteById(long id);

    void save(Post p);

    Post findById(long id);

    List<Post> findPostByTitle(String title);

    void addComment(long id, Comment comment);

}
