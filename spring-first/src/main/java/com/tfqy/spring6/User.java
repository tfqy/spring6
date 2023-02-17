package com.tfqy.spring6;

public class User {

    private String name;

    private Person person;

    //无参数构造
    public User() {
        System.out.println("0: 无参数构造执行了..");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }

    public void add() {
        System.out.println("add.....");
    }
}
