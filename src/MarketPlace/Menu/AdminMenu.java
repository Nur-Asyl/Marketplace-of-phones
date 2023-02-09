package MarketPlace.Menu;

import Controllers.ObjectController.PhoneController;
import Controllers.UserController.UserController;
import MarketPlace.Menu.ManagementMenu.PhoneMenu;
import MarketPlace.Menu.ManagementMenu.UserMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Repositories.DBProporties.DBPhoneProporties.*;


public class AdminMenu {
    PhoneController phoneController;
    UserController userController;
    Scanner scanner;
    UserMenu userMenu;
    PhoneMenu phoneMenu;

    public AdminMenu(UserController userController, PhoneController phoneController, Scanner scanner) {
        this.phoneController = phoneController;
        this.userController = userController;
        this.scanner = scanner;
        userMenu = new UserMenu(userController, phoneController, this.scanner);
        phoneMenu = new PhoneMenu(userController, phoneController, this.scanner);
    }

    public void start() {
        int option = 0;
        while (true) {
            System.out.println();
            System.out.println("**********************************");
            System.out.println("---------SYSTEM--------");
            System.out.println("Select option:");
            System.out.println("1. Manage phones");
            System.out.println("2. Manage users");
            System.out.println("0. back");
            System.out.println();

            try {
                System.out.print("Enter option (1-5): ");
                option = scanner.nextInt();
                if (option == 1) {
                    phoneMenu.start();
                } else if (option == 2) {
                    userMenu.start();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + ": Input must be integer");
                scanner.nextLine(); // to ignore incorrect input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("**********************************");
        }
    }
}
