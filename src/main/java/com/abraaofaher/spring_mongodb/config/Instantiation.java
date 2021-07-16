package com.abraaofaher.spring_mongodb.config;

import com.abraaofaher.spring_mongodb.domain.User;
import com.abraaofaher.spring_mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args){

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "BobGrey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}