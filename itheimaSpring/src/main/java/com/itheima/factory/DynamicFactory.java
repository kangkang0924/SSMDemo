package com.itheima.factory;

import com.itheima.dao.Impl.UserDaoImpl;
import com.itheima.dao.UserDao;

public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();

    }
}
