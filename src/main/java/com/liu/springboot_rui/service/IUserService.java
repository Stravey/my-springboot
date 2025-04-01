package com.liu.springboot_rui.service;

import com.liu.springboot_rui.pojo.User;
import com.liu.springboot_rui.pojo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    /**
     * 插入用户
     *
     * @param user 参数
     * @return
     */
    User add(UserDto user);

}
