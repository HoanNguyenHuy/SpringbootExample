package com.hoannh.tranning01.service.impl;

import com.hoannh.tranning01.dto.req.UserCreateDTO;
import com.hoannh.tranning01.model.User;
import com.hoannh.tranning01.repository.UserRepository;
import com.hoannh.tranning01.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User create(UserCreateDTO userCreateDTO) {
        if(!validUser(userCreateDTO)) {
            return null;
        }
        User user = userRepository.findByIdentityNumber(userCreateDTO.getIdentityNumber());
        if(Objects.nonNull(user)) {
            return null;
        }
        User newUser = new User(userCreateDTO.getName(), userCreateDTO.getAge(), user.getGroupId(), userCreateDTO.getIdentityNumber());
        return userRepository.save(newUser);
    }

    public boolean validUser(UserCreateDTO userCreateDTO) {
        return userCreateDTO.getName() == null ||
                Strings.isBlank(userCreateDTO.getName()) ||
                userCreateDTO.getAge() == 0 ||
                userCreateDTO.getGroupId() == 0 ||
                userCreateDTO.getIdentityNumber() == null ||
                Strings.isBlank(userCreateDTO.getName());
    }
}
