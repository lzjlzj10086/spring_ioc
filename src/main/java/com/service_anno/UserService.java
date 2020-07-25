package com.service_anno;

import com.dao_anno.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public void save(){
        userDao.save();
    }
}
