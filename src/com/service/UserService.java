package com.service;

import com.entity.User;

/**
 * 作者：wz
 * 日期: 2020/11/26 17:12
 * 描述:
 */
public interface UserService {
    int register(User user);
    User login(User user);
}
