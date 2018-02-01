package com.niyanz.nhan.sqlserverdemo;

/**
 * Created by Nhan on 1/30/2018.
 */

public class User {
    private String userName;
    private String password;
    private int id;

    public User(int id, String name, String pass) {
        userName = name;
        this.id = id;
        this.password = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
