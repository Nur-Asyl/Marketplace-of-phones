package Repositories.UserRepository.interfaces;

public interface IUserRepository {
    public void createUser();
    public void deleteUser(int id);
    public void updateUserName(int id);
    public void updateUserPassword(int id);
    public void updateUserBalance(int id);
    public void readUser();

}
