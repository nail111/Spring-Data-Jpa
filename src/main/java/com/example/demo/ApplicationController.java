package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;
    @GetMapping
    public List<User> getAllUsers() {
        return applicationService.getAllUsers();
    }
    @PostMapping
    public void addUser(@RequestBody User user) {
        applicationService.addUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        applicationService.deleteById(id);
    }
    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
       return applicationService.findById(id);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        applicationService.deleteAll();
    }
}