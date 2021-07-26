package com.abraaofaher.spring_mongodb.service;

import com.abraaofaher.spring_mongodb.domain.Post;
import com.abraaofaher.spring_mongodb.repository.PostRepository;
import com.abraaofaher.spring_mongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Rapazzzz, achei não o"));
    }

}
