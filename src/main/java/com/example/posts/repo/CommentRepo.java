package com.example.posts.repo;

import com.example.posts.domain.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepo extends CrudRepository<Comment, Long> {

   List<Comment> findAll();


}
