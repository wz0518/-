package com.service.impl;

import com.dao.BaseDao;
import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;

/**
 * 作者：wz
 * 日期: 2020/11/26 17:13
 * 描述:
 */
public class UserServiceImpl implements UserService {
    UserDao userDao =new UserDaoImpl();
    @Override
    public int register(User user) {
        return userDao.insert(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByNameAndPassword(user);
    }
}
