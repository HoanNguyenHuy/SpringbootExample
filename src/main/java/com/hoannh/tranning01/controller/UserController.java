package com.hoannh.tranning01.controller;

import com.hoannh.tranning01.dto.req.UserCreateDTO;
import com.hoannh.tranning01.model.User;
import com.hoannh.tranning01.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/users")
public class UserController {
    @Autowired
    IUserService iUserService;

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody UserCreateDTO userCreateDTO) {
        return ResponseEntity.ok(iUserService.create(userCreateDTO));
    }
}
