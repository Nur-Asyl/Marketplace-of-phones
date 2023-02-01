package MarketPlace;

import Controllers.ObjectController.PhoneController;
import Controllers.UserController.UserController;
import MarketPlace.Menu.AdminMenu;
import MarketPlace.Menu.UserMenu;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Application {

    private final UserController userController;
    private final PhoneController phoneController;
    private final Scanner scanner;

    public Application(UserController userController, PhoneController phoneController) {
        this.userController = userController;
        this.phoneController = phoneController;
        this.scanner = new Scanner(System.in);
    }
    public Application(UserController userController, PhoneController phoneController, Scanner scanner) {
        this.userController = userController;
        this.phoneController = phoneController;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            try {
                UserMenu userMenu = new UserMenu(this.userController, this.phoneController, scanner);
                AdminMenu adminMenu = new AdminMenu(this.userController, this.phoneController, scanner);
                System.out.println("1. Marketplace");
                System.out.println("2. Profile");
                System.out.println("3. for Admin");
                System.out.println("Option:");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println(phoneController.getAllPhones());
                } else if (option == 2) {
                    userMenu.start();
                } else if (option == 3) {
                    adminMenu.start();
                } else {
                    this.scanner.close();
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
