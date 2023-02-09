package Repositories.PurchasesRepository;

import Data.interfaces.IDB;
import Entities.Objects.Phones.Phone;
import Entities.Purchases.Purchase;
import Entities.Users.User;
import Repositories.PurchasesRepository.interfaces.IPurchasesRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static Repositories.DBProporties.DBPurchasesProporties.*;
import static Repositories.DBProporties.DBUserProporties.*;

public class PurchasesRepository implements IPurchasesRepository {

    private final IDB db;

    public PurchasesRepository(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createPurchase(int userId, int phoneId) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO " + DB_PURCHASE_TABLE + "(" +
                    DB_PURCHASE_PHONE_ID + "," +
                    DB_PURCHASE_USER_ID + "," +
                    DB_PURCHASE_IS_BOUGHT + ") VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, phoneId);
            st.setInt(2, userId);
            st.setBoolean(3, true);

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Purchase> getAllPurchases() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT " +
                    DB_PURCHASE_ID + "," +
                    DB_PURCHASE_USER_ID + "," +
                    DB_PURCHASE_PHONE_ID + "," +
                    DB_PURCHASE_IS_BOUGHT + " FROM " + DB_PURCHASE_TABLE;
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Purchase> purchases = new LinkedList<>();
            while(rs.next()) {
                Purchase purchase = new Purchase(rs.getInt(DB_PURCHASE_ID),
                        rs.getInt(DB_PURCHASE_USER_ID),
                        rs.getInt(DB_PURCHASE_PHONE_ID),
                        rs.getBoolean(DB_PURCHASE_IS_BOUGHT));

                purchases.add(purchase);
            }

            return purchases;
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
