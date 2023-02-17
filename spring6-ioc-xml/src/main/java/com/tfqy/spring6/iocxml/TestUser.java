package com.tfqy.spring6.iocxml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2023/2/13 14:06
 *
 * @author tfqy
 */

public class TestUser {
    @Test
    public void testGetBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.println("根据id获取对象：" + user);
    }

    @Test
    public void testGetBean2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User user = ac.getBean(User.class);
        System.out.println("根据type获取对象：" + user);
    }

    @Test
    public void testGetBean3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User user = ac.getBean("user", User.class);
        System.out.println("根据id和type获取对象：" + user);
    }
}
