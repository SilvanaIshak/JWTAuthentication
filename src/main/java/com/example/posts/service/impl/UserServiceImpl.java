package com.example.posts.service.impl;

import com.example.posts.domain.Post;
import com.example.posts.domain.User;
import com.example.posts.repo.UserRepo;
import com.example.posts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return  userRepo.findAll();
    }

    @Override
    public void deleteById(long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<Post> findPost(long id) {
        return userRepo.findById(id).orElse(null).getPosts();
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public List<User> UserPostsCount(int count) {
        return userRepo.UserPostsCount(count);
    }

    @Override
    public void addPost(long id, Post post) {
        User user = userRepo.findById(id).orElse(null);
        user.getPosts().add(post);
        userRepo.save(user);
    }

}
