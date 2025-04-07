package com.liu.springboot_rui.service;

import com.liu.springboot_rui.pojo.User;
import com.liu.springboot_rui.pojo.dto.UserDto;
import com.liu.springboot_rui.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {

        User userPojo = new User();

        BeanUtils.copyProperties(user,user);

        return userRepository.save(userPojo);
    }
}
