package Controllers.PurchasesController;

import Controllers.UserController.UserController;
import Entities.Objects.Phones.Phone;
import Entities.Purchases.Purchase;
import Entities.Users.User;
import Repositories.ObjectRepository.interfaces.IPhoneRepository;
import Repositories.PurchasesRepository.interfaces.IPurchasesRepository;
import Repositories.UserRepository.interfaces.IUserRepository;

import java.util.List;

public class PurchasesController {
    private final IPurchasesRepository purchaseRepo;
    private final IUserRepository userRepo;
    private final IPhoneRepository phoneRepo;

    public PurchasesController(IPurchasesRepository purchaseRepo, IUserRepository userRepo, IPhoneRepository phoneRepo) {
        this.purchaseRepo = purchaseRepo;
        this.userRepo = userRepo;
        this.phoneRepo = phoneRepo;
    }

    public String createPurchase(int userId, int phoneId){
        User user = userRepo.getUser(userId);
        Phone phone = phoneRepo.getPhone(phoneId);
        boolean created = false;
        if(user.getBalance() >= phone.getCost()){
            userRepo.updateUserBalance(user.getId(), user.getBalance() - phone.getCost());
            created = purchaseRepo.createPurchase(userId, phoneId);
        }
        return (created) ? "|------| Success purchase |------|" : "|------| Purchase failed |------|";
    }

    public String getAllPurchases(){
        String displayAllPurchases = "";
        List<Purchase> purchaes = purchaseRepo.getAllPurchases();
        for(Purchase p : purchaes){
            displayAllPurchases += p.toString() + " => " + phoneRepo.getPhone(p.getPhoneId()) + "\n";
        }
        return displayAllPurchases;
    }
}
