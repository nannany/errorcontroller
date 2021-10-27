package com.example.demo.controller;

import com.example.demo.record.MyErrorResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MyErrorController implements ErrorController {

    @RequestMapping("error")
    public MyErrorResponse errorMessage(HttpServletRequest httpServletRequest) {

        System.out.println("error controller");

        return new MyErrorResponse("error");

    }
}
