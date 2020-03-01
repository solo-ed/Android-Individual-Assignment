package com.solo.auth;

public class UsersModel {
    private String FullName;
    private String phone;

    private UsersModel(){}

    private UsersModel(String FullName,String phone){

        this.FullName=FullName;
        this.phone=phone;
    }

    public String getFullName() {
        return FullName;
    }
    public String getPhone() {
        return phone;
    }
}
