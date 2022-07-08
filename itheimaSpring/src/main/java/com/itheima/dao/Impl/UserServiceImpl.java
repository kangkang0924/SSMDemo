package com.itheima.dao.Impl;


import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    public UserServiceImpl() {

    }

    /*public UserDao getUserDao() {
            return userDao;
        }

        public void setUserDao(UserDao userDao) {
            this.userDao = userDao;
        }*/
    public void save() {
        userDao.save();
    }
}
