package Repositories.ObjectRepository;

import Data.interfaces.IDB;
import Entities.Objects.Phones.Phone;
import Entities.Objects.Phones.Wire.Button.ButtonPhone;
import Entities.Objects.Phones.Wire.Disk.DiskPhone;
import Entities.Objects.Phones.Wire.WiredPhone;
import Entities.Objects.Phones.Wireless.Cellular.Base_model.CellularPhoneBaseModel;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.CellularPhoneAndroid;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.IOS.CellularPhoneIOS;
import Entities.Objects.Phones.Wireless.Radio.RadioPhone;
import Repositories.ObjectRepository.interfaces.IPhoneRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static Repositories.DBProporties.DBPhoneProporties.*;

public class PhoneRepository implements IPhoneRepository {

    private final IDB db;

    public PhoneRepository(IDB db) {
        this.db = db;
    }


    @Override
    public boolean createCellularPhoneBaseModel(CellularPhoneBaseModel phone) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO " + DB_PHONE_TABLE_PHONE + "(" +
                    DB_PHONE_NAME + "," +
                    DB_PHONE_COMPANY + "," +
                    DB_PHONE_AMOUNT_LEFT + "," +
                    DB_PHONE_COST + "," +
                    DB_PHONE_NETWORK_TYPE + "," +
                    DB_PHONE_OS + "," +
                    DB_PHONE_SCREEN_SIZE + "," +
                    DB_PHONE_CAMERA_PIXEL +") VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, phone.getName());
            st.setString(2, phone.getCompany());
            st.setInt(3, phone.getAmountLeft());
            st.setFloat(4, phone.getCost());
            st.setString(5, phone.getNetworkType());
            st.setString(6, phone.getOs());
            st.setString(7, phone.getScreenSize());
            st.setString(8, phone.getCameraPixel());

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
    public boolean createCellularPhoneAndroid(CellularPhoneAndroid phone) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO " + DB_PHONE_TABLE_PHONE + "(" +
                    DB_PHONE_NAME + "," +
                    DB_PHONE_COMPANY + "," +
                    DB_PHONE_AMOUNT_LEFT + "," +
                    DB_PHONE_COST + "," +
                    DB_PHONE_NETWORK_TYPE + "," +
                    DB_PHONE_OS + "," +
                    DB_PHONE_SCREEN_SIZE + "," +
                    DB_PHONE_CAMERA_PIXEL + "," +
                    DB_PHONE_SENSORS + "," +
                    DB_PHONE_ANDROID_VERSION +") VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, phone.getName());
            st.setString(2, phone.getCompany());
            st.setInt(3, phone.getAmountLeft());
            st.setFloat(4, phone.getCost());
            st.setString(5, phone.getNetworkType());
            st.setString(6, phone.getOs());
            st.setString(7, phone.getScreenSize());
            st.setString(8, phone.getCameraPixel());
            st.setString(9, phone.getSensors());
            st.setString(10, phone.getAndroidVersion());

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
    public boolean createRadioPhone(RadioPhone phone) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO " + DB_PHONE_TABLE_PHONE + "(" +
                    DB_PHONE_NAME + "," +
                    DB_PHONE_COMPANY + "," +
                    DB_PHONE_AMOUNT_LEFT + "," +
                    DB_PHONE_COST + "," +
                    DB_PHONE_NETWORK_TYPE + "," +
                    DB_PHONE_OS + "," +
                    DB_PHONE_FREQUENCY + ") VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, phone.getName());
            st.setString(2, phone.getCompany());
            st.setInt(3, phone.getAmountLeft());
            st.setFloat(4, phone.getCost());
            st.setString(5, phone.getNetworkType());
            st.setString(6, phone.getOs());
            st.setInt(7, phone.getFrequency());

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
    public boolean createCellularPhoneIOS(CellularPhoneIOS phone) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO " + DB_PHONE_TABLE_PHONE + "(" +
                    DB_PHONE_NAME + "," +
                    DB_PHONE_COMPANY + "," +
                    DB_PHONE_AMOUNT_LEFT + "," +
                    DB_PHONE_COST + "," +
                    DB_PHONE_NETWORK_TYPE + "," +
                    DB_PHONE_OS + "," +
                    DB_PHONE_SCREEN_SIZE + "," +
                    DB_PHONE_CAMERA_PIXEL + "," +
                    DB_PHONE_SENSORS + "," +
                    DB_PHONE_IOS_VERSION +") VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, phone.getName());
            st.setString(2, phone.getCompany());
            st.setInt(3, phone.getAmountLeft());
            st.setFloat(4, phone.getCost());
            st.setString(5, phone.getNetworkType());
            st.setString(6, phone.getOs());
            st.setString(7, phone.getScreenSize());
            st.setString(8, phone.getCameraPixel());
            st.setString(9, phone.getSensors());
            st.setString(10, phone.getIosVersion());

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
    public boolean createButtonPhone(ButtonPhone phone) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO " + DB_PHONE_TABLE_PHONE + "(" +
                    DB_PHONE_NAME + "," +
                    DB_PHONE_COMPANY + "," +
                    DB_PHONE_AMOUNT_LEFT + "," +
                    DB_PHONE_COST + "," +
                    DB_PHONE_CONNECTION_TYPE +") VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, phone.getName());
            st.setString(2, phone.getCompany());
            st.setInt(3, phone.getAmountLeft());
            st.setFloat(4, phone.getCost());
            st.setString(5, phone.getConnectionType());

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
    public boolean createDiskPhone(DiskPhone phone) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO " + DB_PHONE_TABLE_PHONE + "(" +
                    DB_PHONE_NAME + "," +
                    DB_PHONE_COMPANY + "," +
                    DB_PHONE_AMOUNT_LEFT + "," +
                    DB_PHONE_COST + "," +
                    DB_PHONE_CONNECTION_TYPE +") VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, phone.getName());
            st.setString(2, phone.getCompany());
            st.setInt(3, phone.getAmountLeft());
            st.setFloat(4, phone.getCost());
            st.setString(5, phone.getConnectionType());

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
    public boolean deletePhone(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "DELETE FROM " + DB_PHONE_TABLE_PHONE + " WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            st.executeUpdate();
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
    public boolean updatePhoneName(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_NAME + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneCompany(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_COMPANY + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneAmountLeft(int id, int newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_AMOUNT_LEFT + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;    }

    @Override
    public boolean updatePhoneCost(int id, float newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_COST + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setFloat(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;    }

    @Override
    public boolean updatePhoneNetworkType(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_NETWORK_TYPE + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneConnectionType(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_CONNECTION_TYPE + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneOs(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_OS + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneScreenSize(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_SCREEN_SIZE + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneCameraPixel(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_CAMERA_PIXEL + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneSensors(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_SENSORS + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneAndroidVersion(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_ANDROID_VERSION + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public boolean updatePhoneIOSVersion(int id, String newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_IOS_VERSION + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }
    @Override
    public boolean updatePhoneFrequency(int id, int newValue) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE " + DB_PHONE_TABLE_PHONE + " SET " + DB_PHONE_FREQUENCY + " = ? WHERE id=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, newValue);
            st.setInt(2, id);


            st.executeUpdate();
            return true;
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
        return false;
    }

    @Override
    public Phone getPhone(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM " + DB_PHONE_TABLE_PHONE + " WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                if (rs.getString(DB_PHONE_COMPANY).equals("Samsung") || rs.getString(DB_PHONE_COMPANY).equals("Huawei") || rs.getString(DB_PHONE_COMPANY).equals("Oppo")) {

                    CellularPhoneAndroid phone = new CellularPhoneAndroid(
                            rs.getInt(DB_PHONE_ID),
                            rs.getString(DB_PHONE_NAME),
                            rs.getString(DB_PHONE_COMPANY),
                            rs.getInt(DB_PHONE_AMOUNT_LEFT),
                            rs.getFloat(DB_PHONE_COST),
                            rs.getString(DB_PHONE_NETWORK_TYPE),
                            rs.getString(DB_PHONE_OS),
                            rs.getString(DB_PHONE_SCREEN_SIZE),
                            rs.getString(DB_PHONE_CAMERA_PIXEL),
                            rs.getString(DB_PHONE_SENSORS),
                            rs.getString(DB_PHONE_ANDROID_VERSION));
                    return phone;
                } else if (rs.getString(DB_PHONE_COMPANY).equals("Apple")) {
                    CellularPhoneIOS phone = new CellularPhoneIOS(
                            rs.getInt(DB_PHONE_ID),
                            rs.getString(DB_PHONE_NAME),
                            rs.getString(DB_PHONE_COMPANY),
                            rs.getInt(DB_PHONE_AMOUNT_LEFT),
                            rs.getFloat(DB_PHONE_COST),
                            rs.getString(DB_PHONE_NETWORK_TYPE),
                            rs.getString(DB_PHONE_OS),
                            rs.getString(DB_PHONE_SCREEN_SIZE),
                            rs.getString(DB_PHONE_CAMERA_PIXEL),
                            rs.getString(DB_PHONE_SENSORS),
                            rs.getString(DB_PHONE_IOS_VERSION));
                    return phone;
                } else {
                    WiredPhone phone = new WiredPhone(
                            rs.getInt(DB_PHONE_ID),
                            rs.getString(DB_PHONE_NAME),
                            rs.getString(DB_PHONE_COMPANY),
                            rs.getInt(DB_PHONE_AMOUNT_LEFT),
                            rs.getFloat(DB_PHONE_COST),
                            rs.getString(DB_PHONE_CONNECTION_TYPE));
                    return phone;
                }
            }
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
        return null;
    }

    @Override
    public List<Phone> getAllPhones() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM " + DB_PHONE_TABLE_PHONE;
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Phone> phones = new LinkedList<>();
            Phone phone;
            while(rs.next()) {
                if (rs.getString(DB_PHONE_COMPANY).equals("Samsung") || rs.getString(DB_PHONE_COMPANY).equals("Huawei") || rs.getString(DB_PHONE_COMPANY).equals("Oppo")) {
                    phone = new CellularPhoneAndroid(
                            rs.getInt(DB_PHONE_ID),
                            rs.getString(DB_PHONE_NAME),
                            rs.getString(DB_PHONE_COMPANY),
                            rs.getInt(DB_PHONE_AMOUNT_LEFT),
                            rs.getFloat(DB_PHONE_COST),
                            rs.getString(DB_PHONE_NETWORK_TYPE),
                            rs.getString(DB_PHONE_OS),
                            rs.getString(DB_PHONE_SCREEN_SIZE),
                            rs.getString(DB_PHONE_CAMERA_PIXEL),
                            rs.getString(DB_PHONE_SENSORS),
                            rs.getString(DB_PHONE_ANDROID_VERSION));
                } else if (rs.getString(DB_PHONE_COMPANY).equals("Apple")) {
                    phone = new CellularPhoneIOS(
                            rs.getInt(DB_PHONE_ID),
                            rs.getString(DB_PHONE_NAME),
                            rs.getString(DB_PHONE_COMPANY),
                            rs.getInt(DB_PHONE_AMOUNT_LEFT),
                            rs.getFloat(DB_PHONE_COST),
                            rs.getString(DB_PHONE_NETWORK_TYPE),
                            rs.getString(DB_PHONE_OS),
                            rs.getString(DB_PHONE_SCREEN_SIZE),
                            rs.getString(DB_PHONE_CAMERA_PIXEL),
                            rs.getString(DB_PHONE_SENSORS),
                            rs.getString(DB_PHONE_IOS_VERSION));
                } else {
                    phone = new WiredPhone(
                            rs.getInt(DB_PHONE_ID),
                            rs.getString(DB_PHONE_NAME),
                            rs.getString(DB_PHONE_COMPANY),
                            rs.getInt(DB_PHONE_AMOUNT_LEFT),
                            rs.getFloat(DB_PHONE_COST),
                            rs.getString(DB_PHONE_CONNECTION_TYPE));
                }
                phones.add(phone);
            }

            return phones;
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
        return null;
    }

}
