package com.leokenzley.estudomongodb.controller;

import com.leokenzley.estudomongodb.document.UserDocument;
import com.leokenzley.estudomongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
  @Autowired
  private UserService service;
  @PostMapping
  public ResponseEntity<Void> create(@RequestBody UserDocument user) {
    service.create(user);
    return ResponseEntity.ok().build();
  }
}
