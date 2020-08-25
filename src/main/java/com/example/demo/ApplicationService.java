package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {
    @Autowired
    private Repo repo;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public void addUser(User user) {
        repo.save(user);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }
    public void deleteAll() {
        repo.deleteAll();
    }
}