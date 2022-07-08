package com.itheima.service.impl;





import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


public class UserServiceImpl implements UserService {



    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();

    }

}
