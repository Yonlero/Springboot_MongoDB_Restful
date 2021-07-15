package com.abraaofaher.spring_mongodb.service;

import com.abraaofaher.spring_mongodb.domain.User;
import com.abraaofaher.spring_mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}