package com.jay.muzick.controllers;

import com.jay.muzick.models.Listener;
import com.jay.muzick.repositories.ListenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@CrossOrigin
@RestController
@RequestMapping("/api/listeners") // default format: "/api/{plural entity name}"
public class ListenerController {

    @Autowired
    private ListenerRepository listenerRepository;

    @GetMapping("/test")
    public ResponseEntity<?> testRoute() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
    // Create, read, Update, Delete
    // Create = POST
    // Read = GET
    // Update = PUT * POST
    // Delete = DELETE

    @PostMapping("/")
    public ResponseEntity<Listener> createListener(@RequestBody Listener newListener) {
        Listener listener = listenerRepository.save(newListener);

        return new ResponseEntity<>(listener, HttpStatus.CREATED);
    }
}
