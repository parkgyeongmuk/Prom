package com.example.myapplication;

public class User {

    String userID;
    String userPassword;
    String userName;
    String userMali;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMali() {
        return userMali;
    }

    public void setUserMali(String userMali) {
        this.userMali = userMali;
    }

    public User(String userID, String userPassword, String userName, String userMali) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userMali = userMali;

    }
}
