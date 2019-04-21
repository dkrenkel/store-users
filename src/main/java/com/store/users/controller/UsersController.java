package com.store.users.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("users")
public class UsersController {

    @GetMapping
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(null);
    }
}
