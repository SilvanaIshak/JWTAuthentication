package com.example.posts.repo;

import com.example.posts.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findAll();

    void deleteById(long id);

    @Query(value = "select u from User u where u.posts.size > :count")
    public List<User> UserPostsCount(int count);


    User findByEmail(String email);
}
