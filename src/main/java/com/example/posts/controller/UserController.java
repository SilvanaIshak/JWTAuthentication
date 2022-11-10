package com.example.posts.controller;

import com.example.posts.aspect.annotation.ExecutionTime;
import com.example.posts.aspect.annotation.Logger;
import com.example.posts.domain.Post;
import com.example.posts.domain.User;
import com.example.posts.service.PostService;
import com.example.posts.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @Logger
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @Logger
    @PostMapping
    public void create(@RequestBody User user) {
        userService.save(user);
    }

    @Logger
    @GetMapping("/{id}/posts")
    public List<Post> getPost(@PathVariable long id){
        return userService.findPost(id);
    }

    //the annotation
    @Logger
    @ExecutionTime
    @GetMapping("/{id}")
    public User findById(@PathVariable long id){
        return userService.findById(id);
    }

    @Logger
    @GetMapping("/count/{count}")
    public List<User> UserPostsCount(@PathVariable int count){
        return userService.UserPostsCount(count);
    }

    @Logger
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        userService.deleteById(id);
    }

    @Logger
    @PostMapping("/{id}")
    public void addPost(@PathVariable long id, @RequestBody Post post){
        userService.addPost(id, post);
    }

}
