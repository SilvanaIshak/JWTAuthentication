package com.example.posts.service;

import com.example.posts.domain.Post;
import com.example.posts.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void deleteById(long id);

    void save(User user);

    List<Post> findPost(long id);

    User findById(long id);

    List<User> UserPostsCount(int count);
    void addPost(long id, Post post);
}
