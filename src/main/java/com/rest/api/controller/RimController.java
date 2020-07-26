package com.rest.api.controller;

import com.rest.api.error.RimNotFoundException;
import com.rest.api.model.Response;
import com.rest.api.service.VinServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RimController {

    @Autowired
    private VinServiceImpl vinService;

    @GetMapping("/vinId/{vinId}")
    public ResponseEntity<Response> findOne(@PathVariable String vinId) {

        Optional<Response> specDigitResponse = vinService.findById(vinId);

        if (specDigitResponse.isPresent()) {
            return ResponseEntity.ok(specDigitResponse.get());
        } else {
            throw new RimNotFoundException(vinId);
        }
    }

}
