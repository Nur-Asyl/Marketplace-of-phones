package Entities.Users;

import Entities.Users.interfaces.IAdmin;

public class Admin extends User implements IAdmin {

    public Admin(String user_name, String password, int id, float balance) {
        super(user_name, password, id, balance);
    }

}
