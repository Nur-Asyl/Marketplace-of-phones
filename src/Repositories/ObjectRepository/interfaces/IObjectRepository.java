package Repositories.ObjectRepository.interfaces;

public interface IObjectRepository {
    public boolean createObject();
    public boolean deleteObject(int id);
    public boolean updateObjectName(int id);
    public boolean updateObjectCompany(int id);
    public boolean updateObjectAmountLeft(int id);
    public boolean updateObjectCost(int id);
    public Object getObject(int id);
}
