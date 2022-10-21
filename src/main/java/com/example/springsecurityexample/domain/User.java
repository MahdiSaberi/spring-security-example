package com.example.springsecurityexample.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

//@Entity
//@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

//    @Id
//    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
}
