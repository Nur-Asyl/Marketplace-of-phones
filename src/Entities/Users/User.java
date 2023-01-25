package Entities.Users;

import Entities.Users.interfaces.IUser;

public abstract class User implements IUser {
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
    @Override
    public String getUser_name() {
        return user_name;
    }
    @Override
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
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
