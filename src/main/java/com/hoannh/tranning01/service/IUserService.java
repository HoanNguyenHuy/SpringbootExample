package com.hoannh.tranning01.service;

import com.hoannh.tranning01.dto.req.UserCreateDTO;
import com.hoannh.tranning01.model.User;

import java.util.Optional;

public interface IUserService {
    public abstract User create(UserCreateDTO userCreateDTO);
}
