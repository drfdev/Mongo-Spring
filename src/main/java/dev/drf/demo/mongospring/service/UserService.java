package dev.drf.demo.mongospring.service;

import dev.drf.demo.mongospring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserService() {
    }
}
