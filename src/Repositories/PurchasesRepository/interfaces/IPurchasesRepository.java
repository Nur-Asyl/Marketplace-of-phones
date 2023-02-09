package Repositories.PurchasesRepository.interfaces;

import Entities.Purchases.Purchase;

import java.util.List;

public interface IPurchasesRepository {
    public boolean createPurchase(int userId, int phoneId);
    public List<Purchase> getAllPurchases();
}
