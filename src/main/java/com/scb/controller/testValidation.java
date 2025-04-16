package com.scb.controller;

import com.scb.payload.request.SignInRequest;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testValidation {

    @PostMapping(value = "/test-validation", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testValidation(@Valid @RequestBody SignInRequest signInRequest) {

        return "mấy con gà biết gì";
    }

    @GetMapping(value = "/test")
    public String ga() {

        return "mấy con gà biết gì";
    }
}
