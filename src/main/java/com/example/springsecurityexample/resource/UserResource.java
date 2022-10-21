package com.example.springsecurityexample.resource;

import com.example.springsecurityexample.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> getUser(){
        return ResponseEntity.ok(Arrays.asList(
                new User(1L,"Mahdi","Saberi","mahdi","123"),
                new User(2L,"Niloofar","Kaghazchi","niloo","1234")
        ));
    }

}
