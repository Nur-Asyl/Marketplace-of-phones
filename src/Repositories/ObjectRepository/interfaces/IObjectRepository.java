package Repositories.ObjectRepository.interfaces;

public interface IObjectRepository {
    public void createObject();
    public void deleteObject(int id);
    public void updateObjectName(int id);
    public void updateObjectCompany(int id);
    public void updateObjectAmountLeft(int id);
    public void updateObjectCost(int id);
    public void readObject();
}
