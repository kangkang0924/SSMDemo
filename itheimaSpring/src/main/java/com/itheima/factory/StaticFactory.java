package com.itheima.factory;

import com.itheima.dao.Impl.UserDaoImpl;
import com.itheima.dao.UserDao;

public class StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();

    }


}
