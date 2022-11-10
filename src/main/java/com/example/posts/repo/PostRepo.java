package com.example.posts.repo;


import com.example.posts.domain.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {

    List<Post> findAll();

    @Query(value = "Select p from Post p where p.title = :title")
    public List<Post> findPostByTitle(String title);

}
