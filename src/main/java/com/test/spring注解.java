package com.test;

import com.service_anno.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring注解 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext02.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
