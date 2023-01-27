package Repositories.ObjectRepository;

import Data.interfaces.IDB;
import Repositories.ObjectRepository.interfaces.IObjectRepository;

public class ObjectRepository implements IObjectRepository {

    private final IDB db;

    public ObjectRepository(IDB db) {
        this.db = db;
    }


    @Override
    public boolean createObject() {
        return false;
    }

    @Override
    public boolean deleteObject(int id) {
        return false;
    }

    @Override
    public boolean updateObjectName(int id) {
        return false;
    }

    @Override
    public boolean updateObjectCompany(int id) {
        return false;
    }

    @Override
    public boolean updateObjectAmountLeft(int id) {
        return false;
    }

    @Override
    public boolean updateObjectCost(int id) {
        return false;
    }

    @Override
    public Object getObject(int id) {
        return null;
    }
}
