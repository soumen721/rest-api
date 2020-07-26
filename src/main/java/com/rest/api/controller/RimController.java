package com.rest.api.controller;

import com.rest.api.error.RimNotFoundException;
import com.rest.api.model.RimDetails;
import com.rest.api.repository.RimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RimController {

    @Autowired
    private RimRepository repository;

    // Find
    @GetMapping("/rims")
    ResponseEntity<List<RimDetails>> findAll() {

        return ResponseEntity.ok(repository.findAll());
    }

    // Find
    @GetMapping("/rimId/{rimId}")
    ResponseEntity<RimDetails> findOne(@PathVariable Long rimId) {

        Optional<RimDetails> details = repository.findById(rimId);

        if(details.isPresent()){
            return ResponseEntity.ok(details.get());
        }else{
            throw new RimNotFoundException(rimId);
        }
    }

}
