package com.itheima.demo;

import com.itheima.dao.Impl.UserServiceImpl;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserCotroller {
    public static void main(String[] args) {
        /*UserService userService = new UserServiceImpl();
        userService.save();*/
//        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app =new FileSystemXmlApplicationContext("D:\\IDEADemo\\SSMDemo\\itheimaSpring\\src\\main\\resources\\applicationContext.xml");
//        UserService userService = (UserService)app.getBean("userService");
//        UserService userService = app.getBean(UserService.class);
        UserService  userService=app.getBean(UserService.class);
        userService.save();

    }
}
