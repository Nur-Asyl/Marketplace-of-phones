import Controllers.UserController.UserController;
import Data.MySql;
import Data.interfaces.IDB;
import MarketPlace.Application;
import Repositories.ObjectRepository.PhoneRepository;
import Repositories.ObjectRepository.interfaces.IPhoneRepository;
import Repositories.UserRepository.UserRepository;
import Repositories.UserRepository.interfaces.IUserRepository;

public class Main {
    public static void main(String[] args) {

        //Data base
        IDB db = new MySql();

        //Repositories and Controllers
        IUserRepository userRepo = new UserRepository(db);
        IPhoneRepository objectRepo = new PhoneRepository(db);
        UserController userController = new UserController(userRepo);

        // MarketPlace
        Application app = new Application(userController);
        app.start(); // starting Big boy

    }
}