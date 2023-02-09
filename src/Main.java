import Controllers.ObjectController.PhoneController;
import Controllers.PurchasesController.PurchasesController;
import Controllers.UserController.UserController;
import Data.MySql;
import Data.PostgresDB;
import Data.interfaces.IDB;
import MarketPlace.Application;
import Repositories.ObjectRepository.PhoneRepository;
import Repositories.ObjectRepository.interfaces.IPhoneRepository;
import Repositories.PurchasesRepository.PurchasesRepository;
import Repositories.PurchasesRepository.interfaces.IPurchasesRepository;
import Repositories.UserRepository.UserRepository;
import Repositories.UserRepository.interfaces.IUserRepository;

public class Main {
    public static void main(String[] args) {

        //Data base
        IDB db = new PostgresDB();

        //Repositories and Controllers
        IUserRepository userRepo = new UserRepository(db);
        IPhoneRepository phoneRepo = new PhoneRepository(db);
        IPurchasesRepository purchasesRepo = new PurchasesRepository(db);
        UserController userController = new UserController(userRepo);
        PhoneController phoneController = new PhoneController(phoneRepo);
        PurchasesController purchasesController = new PurchasesController(purchasesRepo, userRepo, phoneRepo);

        // MarketPlace
        Application app = new Application(userController, phoneController, purchasesController);
        app.start(); // starting Big boy

    }
}