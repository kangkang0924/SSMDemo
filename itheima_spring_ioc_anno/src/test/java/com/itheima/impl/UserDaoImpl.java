package com.itheima.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Repository;


//<bean id="userDao" class="com.itheima.test.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {


    public void save() {
        System.out.println("save runing...");
    }
}
