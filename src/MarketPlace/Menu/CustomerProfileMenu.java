package MarketPlace.Menu;

import Controllers.ObjectController.PhoneController;
import Controllers.PurchasesController.PurchasesController;
import Controllers.UserController.UserController;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Repositories.DBProporties.DBUserProporties.*;

public class CustomerProfileMenu {

    Scanner scanner;
    UserController userController;
    PhoneController phoneController;
    PurchasesController purchasesController;
    private boolean registered = false;
    private int userId;

    public CustomerProfileMenu(UserController userController, PhoneController phoneController, PurchasesController purchasesController,  Scanner scanner) {
        this.userController = userController;
        this.phoneController = phoneController;
        this.purchasesController = purchasesController;
        this.scanner = scanner;
    }
    public void start() {
        if(authorization()){
            registered = true;
        }
        while (registered) {
            System.out.println();
            System.out.println("**********************************");
            System.out.println("----------Profile-----------");
            showUserMenu();

            System.out.println("Select option:");
            System.out.println("1. Purchases");
            System.out.println("2. Replenish the balance");
            System.out.println("3. Edit");
            System.out.println("4. Sign out");

            System.out.println("0. Exit");
            System.out.println();

            try {
                System.out.print("Enter option (1-4): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println(purchasesController.getAllPurchases());
                } else if (option == 2) {
                    replenishBalanceMenu();
                } else if (option == 3) {
                    updateUserMenu();
                } else if (option == 4) {
                    signOutMenu();
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

    public boolean authorization() {
        if (!registered) {
            System.out.println("Select option:");
            System.out.println("1. Log in");
            System.out.println("2. Sign in");
            System.out.println("0. back");
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllUsersMenu();
                    System.out.print("Please enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Please enter password: ");
                    String password = scanner.nextLine();

                    if (password.equals(getUserPasswordById(id))) {
                        System.out.println("REGISTERED");
                        this.userId = id;
                        return true;
                    } else {
                        System.out.println("\t!!!Wrong id or password!!!");
                        return false;
                    }
                } else if (option == 2) {
                    createUserMenu();
                } else {
                    return false;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + ": Input must be integer");
                scanner.nextLine(); // to ignore incorrect input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    public void getAllUsersMenu() {
        String response = userController.getAllUsers();
        System.out.println(response);
    }

    public String getUserPasswordById(int id) {
        String password = userController.getUserPassword(id);
        return password;
    }

    public void showUserMenu() {
        String response = userController.getUser(this.userId);
        System.out.println(response);
    }

    public void createUserMenu() {
        System.out.println("Please enter " + DB_USER_NAME);
        String name = scanner.next();

        System.out.println("Please enter " + DB_USER_PASSWORD);
        String password = scanner.next();

        String response = userController.createUser(name, password, 0.0f);
        System.out.println(response);
    }

    public void updateUserMenu(){
        while(true) {
            userController.getUser(this.userId).toString();
            System.out.print("Edit:" +
                    "\n1. " + DB_USER_NAME +
                    "\n2. " + DB_USER_PASSWORD +
                    "\n9. back" +
                    "\nEnter option(1-5): ");
            try {
                int option = scanner.nextInt();
                scanner.nextLine();
                if (option == 1) {
                    System.out.print("Edit " + DB_USER_NAME + " : ");
                    System.out.println("\t" + userController.updateUserName(this.userId, scanner.nextLine()));
                } else if (option == 2) {
                    System.out.print("Edit " + DB_USER_PASSWORD + " : ");
                    System.out.println("\t" + userController.updateUserPassword(this.userId, scanner.nextLine()));
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + ": Input must be integer");
                scanner.nextLine(); // to ignore incorrect input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void replenishBalanceMenu() {
        try {
            System.out.print("Replenish " + DB_USER_BALANCE + " : ");
            System.out.println("\t" + userController.updateUserBalance(this.userId, scanner.nextFloat() + userController.getUserBalance(this.userId)));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void signOutMenu(){
        registered = false;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
