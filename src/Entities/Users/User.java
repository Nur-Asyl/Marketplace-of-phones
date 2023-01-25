package Entities.Users;

import Entities.Users.interfaces.IUser;

public class User implements IUser {
    private String user_name;
    private String password;
    private int id;
    private float balance;

    public User(String user_name, String password, int id, float balance) {
        this.user_name = user_name;
        this.password = password;
        this.id = id;
        this.balance = balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
