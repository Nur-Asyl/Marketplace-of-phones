package MarketPlace.Menu;

import Controllers.ObjectController.PhoneController;
import Controllers.UserController.UserController;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Repositories.DBProporties.DBPhoneProporties.*;


public class AdminMenu {
    PhoneController phoneController;
    UserController userController;
    Scanner scanner;

    public AdminMenu(UserController userController, PhoneController phoneController, Scanner scanner) {
        this.phoneController = phoneController;
        this.userController = userController;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("**********************************");
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all phones");
            System.out.println("2. Get phone by id");
            System.out.println("3. Create phone");
            System.out.println("4. Update phone");
            System.out.println("5. Delete phone");

            System.out.println("0. Exit");
            System.out.println();

            try {
                System.out.print("Enter option (1-5): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllPhonesMenu();
                } else if (option == 2) {
                    getPhoneByIdMenu();
                } else if (option == 3) {
                    createPhoneMenu();
                } else if (option == 4) {
                    updatePhoneMenu();
                } else if (option == 5) {
                    deletePhoneMenu();
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


    public void getAllPhonesMenu() {
        String response = phoneController.getAllPhones();
        System.out.println(response);
    }

    public void getPhoneByIdMenu() {
        System.out.print("Please enter id: ");

        int id = scanner.nextInt();
        String response = phoneController.getPhone(id);
        System.out.println(response);
    }

    public void createPhoneMenu() {

        System.out.println("create:");
        System.out.println("1. Wire");
        System.out.println("2. Wireless");
        System.out.println("0. exit");
        System.out.print("Option (1-2): ");
        int option = scanner.nextInt();
        if(option == 1){
            System.out.println("1. Button Phone");
            System.out.println("2. Disk Phone");
            System.out.println("0. back");
            System.out.print("Option (1-2): ");
            option = scanner.nextInt();
            if(option == 1){
                // button phone
                System.out.println(createButtonPhoneMenu());
            } else if(option == 2){
                // disk phone
                System.out.println(createDiskPhoneMenu());
            } else{
                createPhoneMenu();
            }
        } else if(option == 2){
            System.out.println("1. Cellular");
            System.out.println("2. Radio");
            System.out.println("0. back");
            System.out.print("Option (1-2): ");
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("1. Base Model");
                System.out.println("2. Smartphone");
                System.out.println("0. back");
                System.out.print("Option (1-2): ");
                option = scanner.nextInt();
                if(option == 1){
                    // base model
                    System.out.println(createCellularBaseModel());
                } else if(option == 2){
                    // smartphone
                    System.out.println("1. Android");
                    System.out.println("2. IOS");
                    System.out.println("0. back");
                    System.out.print("Option (1-2): ");
                    option = scanner.nextInt();
                    if(option == 1){
                        //android
                        System.out.println("1. Samsung");
                        System.out.println("2. Huawei");
                        System.out.println("3. Oppo");
                        System.out.println("0. back");
                        System.out.print("Option (1-3): ");
                        option = scanner.nextInt();
                        if(option == 1){
                            System.out.println(createCellularSamsungPhoneMenu());
                        } else if(option == 2){
                            System.out.println(createCellularHuaweiPhoneMenu());
                        } else if(option == 3){
                            System.out.println(createCellularOppoPhoneMenu());
                        } else{
                            createPhoneMenu();
                        }
                    } else if(option == 2){
                        // ios
                        System.out.println("1. Apple");
                        System.out.println("0. back");
                        System.out.print("Option (1): ");
                        option = scanner.nextInt();
                        if(option == 1){
                            System.out.println(createCellularIPhoneMenu());
                        } else{
                            createPhoneMenu();
                        }
                    } else{
                        createPhoneMenu();
                    }
                } else{
                    createPhoneMenu();
                }
            } else if(option == 2){
                //radio phone
                System.out.println(createRadioPhoneMenu());
            } else{
                createPhoneMenu();
            }
        }
    }

    private String createRadioPhoneMenu() {
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_NETWORK_TYPE);
        String networkType = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_OS);
        String os = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_FREQUENCY);
        int frequency = scanner.nextInt();
        scanner.nextLine();

        String response = phoneController.createRadioPhone(name, company, amountLeft, cost, networkType, os, frequency);
        return response;
    }

    public String createCellularSamsungPhoneMenu(){
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_NETWORK_TYPE);
        String networkType = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_OS);
        String os = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SCREEN_SIZE);
        String screenSize = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_CAMERA_PIXEL);
        String cameraPixel = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SENSORS);
        String sensors = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_ANDROID_VERSION);
        String androidVersion = scanner.nextLine();

        String response = phoneController.createCellularPhoneAndroidSamsung(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        return response;
    }
    public String createCellularHuaweiPhoneMenu(){
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.next();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_NETWORK_TYPE);
        String networkType = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_OS);
        String os = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SCREEN_SIZE);
        String screenSize = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_CAMERA_PIXEL);
        String cameraPixel = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SENSORS);
        String sensors = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_ANDROID_VERSION);
        String androidVersion = scanner.nextLine();

        String response = phoneController.createCellularPhoneAndroidHuawei(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        return response;
    }
    public String createCellularOppoPhoneMenu(){
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_NETWORK_TYPE);
        String networkType = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_OS);
        String os = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SCREEN_SIZE);
        String screenSize = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_CAMERA_PIXEL);
        String cameraPixel = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SENSORS);
        String sensors = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_ANDROID_VERSION);
        String androidVersion = scanner.nextLine();

        String response = phoneController.createCellularPhoneAndroidOppo(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        return response;
    }
    public String createCellularIPhoneMenu(){
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_NETWORK_TYPE);
        String networkType = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_OS);
        String os = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SCREEN_SIZE);
        String screenSize = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_CAMERA_PIXEL);
        String cameraPixel = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SENSORS);
        String sensors = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_IOS_VERSION);
        String iosVersion = scanner.nextLine();

        String response = phoneController.createCellularPhoneIPhone(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, iosVersion);
        return response;
    }
    public String createButtonPhoneMenu(){
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_CONNECTION_TYPE);
        String connectionType = scanner.nextLine();

        String response = phoneController.createButtonPhone(name, company, amountLeft, cost, connectionType);
        return response;
    }
    public String createCellularBaseModel(){
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_NETWORK_TYPE);
        String networkType = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_OS);
        String os = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_SCREEN_SIZE);
        String screenSize = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_CAMERA_PIXEL);
        String cameraPixel = scanner.nextLine();

        String response = phoneController.createCellularPhoneBaseModel(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel);
        return response;
    }
    public String createDiskPhoneMenu(){
        scanner.nextLine();
        System.out.println("Please enter " + DB_PHONE_NAME);
        String name = scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_COMPANY);
        String company = scanner.nextLine();

        System.out.println("Please enter(int) " + DB_PHONE_AMOUNT_LEFT);
        int amountLeft = scanner.nextInt();

        System.out.println("Please enter(float) " + DB_PHONE_COST);
        float cost = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter " + DB_PHONE_CONNECTION_TYPE);
        String connectionType = scanner.nextLine();

        String response = phoneController.createDiskPhone(name, company, amountLeft, cost, connectionType);
        return response;
    }


    public void updatePhoneMenu(){
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        while(true) {
            phoneController.getPhone(id).toString();

            System.out.print("Edit:" +
                    "\n1. " + DB_PHONE_NAME +
                    "\n2. " + DB_PHONE_COMPANY +
                    "\n3. " + DB_PHONE_AMOUNT_LEFT +
                    "\n4. " + DB_PHONE_COST +
                    "\n5. " + DB_PHONE_NETWORK_TYPE +
                    "\n6. " + DB_PHONE_CONNECTION_TYPE +
                    "\n7. " + DB_PHONE_OS +
                    "\n8. " + DB_PHONE_SCREEN_SIZE +
                    "\n9. " + DB_PHONE_CAMERA_PIXEL +
                    "\n10. " + DB_PHONE_SENSORS +
                    "\n11. " + DB_PHONE_ANDROID_VERSION +
                    "\n12. " + DB_PHONE_IOS_VERSION +
                    "\n13. " + DB_PHONE_FREQUENCY +
                    "\n0. back" +
                    "\nEnter option(1-5): ");
            try {
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.print("Edit" + DB_PHONE_NAME + " : ");
                    System.out.println("\t" + phoneController.updatePhoneName(id, scanner.next()));
                } else if (option == 2) {
                    System.out.print("Edit" + DB_PHONE_COMPANY + " : ");
                    System.out.println("\t" + phoneController.updatePhoneCompany(id, scanner.next()));
                } else if (option == 3) {
                    System.out.print("Edit" + DB_PHONE_AMOUNT_LEFT + " : ");
                    System.out.println("\t" + phoneController.updatePhoneAmountLeft(id, scanner.nextInt()));
                } else if (option == 4) {
                    System.out.print("Edit" + DB_PHONE_COST + " : ");
                    System.out.println("\t" + phoneController.updatePhoneCost(id, scanner.nextFloat()));
                } else if (option == 5) {
                    System.out.print("Edit" + DB_PHONE_NETWORK_TYPE + " : ");
                    System.out.println("\t" + phoneController.updatePhoneNetworkType(id, scanner.next()));
                } else if (option == 6) {
                    System.out.print("Edit" + DB_PHONE_CONNECTION_TYPE + " : ");
                    System.out.println("\t" + phoneController.updatePhoneConnectionType(id, scanner.next()));
                } else if (option == 7) {
                    System.out.print("Edit" + DB_PHONE_OS + " : ");
                    System.out.println("\t" + phoneController.updatePhoneOs(id, scanner.next()));
                } else if (option == 8) {
                    System.out.print("Edit" + DB_PHONE_SCREEN_SIZE + " : ");
                    System.out.println("\t" + phoneController.updatePhoneScreenSize(id, scanner.next()));
                } else if (option == 9) {
                    System.out.print("Edit" + DB_PHONE_CAMERA_PIXEL + " : ");
                    System.out.println("\t" + phoneController.updatePhoneCameraPixel(id, scanner.next()));
                } else if (option == 10) {
                    System.out.print("Edit" + DB_PHONE_SENSORS + " : ");
                    System.out.println("\t" + phoneController.updatePhoneSensors(id, scanner.next()));
                } else if (option == 11) {
                    System.out.print("Edit" + DB_PHONE_ANDROID_VERSION + " : ");
                    System.out.println("\t" + phoneController.updatePhoneAndroidVersion(id, scanner.next()));
                } else if (option == 12) {
                    System.out.print("Edit" + DB_PHONE_IOS_VERSION + " : ");
                    System.out.println("\t" + phoneController.updatePhoneIOSVersion(id, scanner.next()));
                } else if (option == 13) {
                    System.out.print("Edit" + DB_PHONE_FREQUENCY + " : ");
                    System.out.println("\t" + phoneController.updatePhoneFrequency(id, scanner.nextInt()));
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

    public void deletePhoneMenu(){
        System.out.print("Please enter id: ");

        int id = scanner.nextInt();
        String response = phoneController.deletePhone(id);
        System.out.println(response);
    }
}
