package com.example.demo.advice;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyControllerAdvice {

    @ModelAttribute
    public void systemOut() {
        System.out.println("rest controller advice");
    }

}
