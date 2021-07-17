package com.abraaofaher.spring_mongodb.service;

import com.abraaofaher.spring_mongodb.domain.User;
import com.abraaofaher.spring_mongodb.repository.UserRepository;
import com.abraaofaher.spring_mongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Rapazzzz, achei não o"));
    }
}