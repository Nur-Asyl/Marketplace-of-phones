package MarketPlace;

import Controllers.ObjectController.PhoneController;
import Controllers.UserController.UserController;
import MarketPlace.Menu.AdminMenu;
import MarketPlace.Menu.UserMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Repositories.DBProporties.DBUserProporties.*;

public class Application {

    private UserController userController;
    private PhoneController phoneController;
    Scanner scanner;

    public Application(UserController userController, PhoneController phoneController) {
        this.userController = userController;
        this.phoneController = phoneController;
        this.scanner = new Scanner(System.in);
    }

    public Application(UserController userController) {
        this.scanner = scanner;
        this.scanner = new Scanner(System.in);
        this.userController = userController;
    }
    public Application(PhoneController phoneController) {
        this.scanner = new Scanner(System.in);
        this.phoneController = phoneController;
    }

    public void start() {
        while (true) {
            try {
                UserMenu userMenu = new UserMenu(userController);
                AdminMenu adminMenu = new AdminMenu(phoneController, this.scanner);
                System.out.println("1. Marketplace");
                System.out.println("2. Profile");
                System.out.println("3. for Admin");
                System.out.println("Option:");
                int option = scanner.nextInt();
                if (option == 1) {
                    phoneController.getAllPhones();
                } else if (option == 2) {
                    userMenu.start();
                } else if (option == 3) {
                    adminMenu.start();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + ": Input must be integer");
                //scanner.nextLine(); // to ignore incorrect input
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
