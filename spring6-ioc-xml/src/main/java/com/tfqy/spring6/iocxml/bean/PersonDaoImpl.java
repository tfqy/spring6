package com.tfqy.spring6.iocxml.bean;

public class PersonDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("person run....");
    }
}
