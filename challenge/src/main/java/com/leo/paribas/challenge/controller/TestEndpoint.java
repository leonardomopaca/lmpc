package com.leo.paribas.challenge.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint {

    @GetMapping("/test")
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("Funcionando", HttpStatus.OK);
    }

}
