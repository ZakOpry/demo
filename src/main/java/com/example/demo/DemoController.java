package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DemoController {

    @Autowired
    private GetJokes getJokes;

    @GetMapping("/helloWorld")
    public String getGreeting(){
        return "Hello World";
    }

    @GetMapping("/getChuckJoke")
    public String getJoke() throws IOException, InterruptedException {
        return getJokes.makeCall();
    }
}
