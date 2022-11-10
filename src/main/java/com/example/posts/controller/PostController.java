package com.example.posts.controller;

import com.example.posts.domain.Comment;
import com.example.posts.domain.Post;
import com.example.posts.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {

    @Autowired
    PostService postService;
    
    @GetMapping
    public List<Post> getAllPosts()  {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") long id){
        return postService.findById(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        postService.deleteById(id);
    }

    @PostMapping()
    public void save(@RequestBody Post p) {
        postService.save(p);
    }

    @GetMapping("/title/{title}")
    public List<Post> findPostByTitle(@PathVariable("title") String title){
        return postService.findPostByTitle(title);
    }

    @PostMapping("/{id}/comments")
    public void addComment(@PathVariable("id") long id, @RequestBody Comment comment) {
        postService.addComment(id, comment);
    }

}
