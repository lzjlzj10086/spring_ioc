package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;

/**
 * 依赖注入两种：
 *      1.set方法
 *      2构造方法
 */
/**
 * 配置文件set方法注入
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
