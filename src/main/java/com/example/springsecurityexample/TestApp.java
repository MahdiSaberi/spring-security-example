package com.example.springsecurityexample;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TestApp {
    public static void main(String[] args) {

        byte[] encode = Base64.getEncoder().encode("admin:123".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(encode));
    }
}
