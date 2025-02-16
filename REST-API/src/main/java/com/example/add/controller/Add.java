package com.example.add.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.add.model.Request;
import com.example.add.model.Response;

@RestController
@RequestMapping("/")
public class Add {


    @PostMapping
    public Response add(@RequestBody Request request){
        int first = request.getFirst();
        int second = request.getSecond();

        int result = first + second;

        Response response = new Response();
        response.setFirst(first);
        response.setSecond(second);
        response.setResult(result);

        return response;
        
    }




}
