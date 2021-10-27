package com.example.demo.controller;

import com.example.demo.record.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class MyController {

    @GetMapping("message")
    public MyResponse getMessages() throws Exception {

        String firstMessage = UUID.randomUUID().toString();
        String secondMessage = UUID.randomUUID().toString();

        Pattern pattern = Pattern.compile("^[12345678].*");
        if (pattern.matcher(firstMessage).find()) {
            throw new Exception();
        }

        return new MyResponse(firstMessage, secondMessage);
    }
}
