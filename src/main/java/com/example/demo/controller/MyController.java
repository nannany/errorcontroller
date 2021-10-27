package com.example.demo.controller;

import com.example.demo.record.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MyController {

    @GetMapping("message")
    public MyResponse getMessages() {

        String firstMessage = UUID.randomUUID().toString();
        String secondMessage = UUID.randomUUID().toString();
        return new MyResponse(firstMessage, secondMessage);
    }
}
