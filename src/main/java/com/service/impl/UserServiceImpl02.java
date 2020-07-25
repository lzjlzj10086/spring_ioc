package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;

/**
 * 依赖注入两种：
 *      1.set方法
 *      2构造方法
 */

/**
 * 配置文件构造方法注入
 */
public class UserServiceImpl02 implements UserService {
    private UserDao userDao;

    public UserServiceImpl02(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl02() {
    }

    @Override
    public void save() {
        userDao.save();
    }
}
