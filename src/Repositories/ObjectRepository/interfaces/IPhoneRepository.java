package Repositories.ObjectRepository.interfaces;

import Entities.Objects.Phones.Phone;
import Entities.Objects.Phones.Wire.Button.ButtonPhone;
import Entities.Objects.Phones.Wire.Disk.DiskPhone;
import Entities.Objects.Phones.Wire.WiredPhone;
import Entities.Objects.Phones.Wireless.Cellular.Base_model.CellularPhoneBaseModel;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.CellularPhoneAndroid;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Samsung.CellularPhoneAndroidSamsung;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Huawei.CellularPhoneAndroidHuawei;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Oppo.CellularPhoneAndroidOppo;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.IOS.Apple.CellularPhoneIOSIPhone;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.IOS.CellularPhoneIOS;
import Entities.Objects.Phones.Wireless.Radio.RadioPhone;

import java.util.List;

public interface IPhoneRepository {
    public boolean createCellularPhoneBaseModel(CellularPhoneBaseModel phone);
    public boolean createCellularPhoneAndroid(CellularPhoneAndroid phone);
    public boolean createCellularPhoneIOS(CellularPhoneIOS phone);
    public boolean createRadioPhone(RadioPhone phone);
    public boolean createButtonPhone(ButtonPhone phone);
    public boolean createDiskPhone(DiskPhone phone);
    public boolean deletePhone(int id);
    public boolean updatePhoneName(int id, String newValue);
    public boolean updatePhoneCompany(int id, String newValue);
    public boolean updatePhoneAmountLeft(int id, int newValue);
    public boolean updatePhoneCost(int id, float newValue);
    public boolean updatePhoneNetworkType(int id, String newValue);
    public boolean updatePhoneConnectionType(int id, String newValue);
    public boolean updatePhoneOs(int id, String newValue);
    public boolean updatePhoneScreenSize(int id, String newValue);
    public boolean updatePhoneCameraPixel(int id, String newValue);
    public boolean updatePhoneSensors(int id, String newValue);
    public boolean updatePhoneAndroidVersion(int id, String newValue);
    public boolean updatePhoneIOSVersion(int id, String newValue);
    public boolean updatePhoneFrequency(int id, int newValue);
    public Phone getPhone(int id);
    List<Phone> getAllPhones();
}
