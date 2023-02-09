package MarketPlace.Menu;

import Controllers.ObjectController.PhoneController;
import Controllers.PurchasesController.PurchasesController;
import Controllers.UserController.UserController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StoreMenu {
    Scanner scanner;
    UserController userController;
    PhoneController phoneController;
    PurchasesController purchasesController;

    public StoreMenu(UserController userController, PhoneController phoneController, PurchasesController purchasesController, Scanner scanner) {
        this.scanner = scanner;
        this.userController = userController;
        this.phoneController = phoneController;
        this.purchasesController = purchasesController;
    }

    public void start(int userId){
        System.out.println("-------------------------------------------");
        System.out.println(phoneController.getAllPhones());
        System.out.println("-------------------------------------------");
        System.out.println("\nSelect option:");
        System.out.println("1. Buy");
        System.out.println("0. back");
        System.out.print("Option:");
        try {
            int option = scanner.nextInt();
            if(option == 1){
                buyMenu(userId);
            }
        } catch (InputMismatchException e){
            System.out.println(e.getMessage() + ": Input must be integer");
            scanner.nextLine();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void buyMenu(int userId){
        System.out.print("Choose phone by id:");
        int phoneId = scanner.nextInt();
        String response = purchasesController.createPurchase(userId, phoneId);
        System.out.println(response);
    }

}
