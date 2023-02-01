package Controllers.ObjectController;

import Entities.Objects.Phones.Phone;
import Entities.Objects.Phones.Wire.Button.ButtonPhone;
import Entities.Objects.Phones.Wire.Disk.DiskPhone;
import Entities.Objects.Phones.Wireless.Cellular.Base_model.CellularPhoneBaseModel;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Huawei.CellularPhoneAndroidHuawei;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Oppo.CellularPhoneAndroidOppo;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Samsung.CellularPhoneAndroidSamsung;
import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.IOS.Apple.CellularPhoneIOSIPhone;
import Entities.Objects.Phones.Wireless.Radio.RadioPhone;
import Repositories.ObjectRepository.interfaces.IPhoneRepository;

import java.util.List;

public class PhoneController {
    private final IPhoneRepository phoneRepo;

    public PhoneController(IPhoneRepository phoneRepo) {
        this.phoneRepo = phoneRepo;
    }


    public String createCellularPhoneBaseModel(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel){
        CellularPhoneBaseModel phone = new CellularPhoneBaseModel(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel);
        boolean created = phoneRepo.createCellularPhoneBaseModel(phone);
        return (created) ? "|------| Cellular Phone Base Model created |------|" : "|------| Cellular Phone Base Model not created |------|";
    }

    public String createCellularPhoneAndroidSamsung(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion){
        CellularPhoneAndroidSamsung phone = new CellularPhoneAndroidSamsung(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        boolean created = phoneRepo.createCellularPhoneAndroid(phone);
        return (created) ? "|------| Samsung Phone created |------|" : "|------| Samsung Phone not created |------|";
    }
    public String createCellularPhoneAndroidHuawei(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion){
        CellularPhoneAndroidHuawei phone = new CellularPhoneAndroidHuawei(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        boolean created = phoneRepo.createCellularPhoneAndroid(phone);
        return (created) ? "|------| Huawei Phone created |------|" : "|------| Huawei Phone not created |------|";
    }
    public String createCellularPhoneAndroidOppo(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion){
        CellularPhoneAndroidOppo phone = new CellularPhoneAndroidOppo(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        boolean created = phoneRepo.createCellularPhoneAndroid(phone);
        return (created) ? "|------| Oppo Phone created |------|" : "|------| Oppo Phone not created |------|";
    }
    public String createCellularPhoneIPhone(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String iosVersion){
        CellularPhoneIOSIPhone phone = new CellularPhoneIOSIPhone(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, iosVersion);
        boolean created = phoneRepo.createCellularPhoneIOS(phone);
        return (created) ? "|------| IPhone created |------|" : "|------| IPhone not created |------|";
    }
    public String createRadioPhone(String name, String company, int amountLeft, float cost, String networkType, String os, int frequency){
        RadioPhone phone = new RadioPhone(name, company, amountLeft, cost, networkType, os, frequency);
        boolean created = phoneRepo.createRadioPhone(phone);
        return (created) ? "|------| Radio Phone created |------|" : "|------| Radio Phone not created |------|";
    }

    public String createButtonPhone(String name, String company, int amountLeft, float cost, String connectionType){
        ButtonPhone phone = new ButtonPhone(name, company, amountLeft, cost, connectionType);
        boolean created = phoneRepo.createButtonPhone(phone);
        return (created) ? "|------| Button Phone created |------|" : "|------| Button Phone not created |------|";
    }
    public String createDiskPhone(String name, String company, int amountLeft, float cost, String connectionType){
        DiskPhone phone = new DiskPhone(name, company, amountLeft, cost, connectionType);
        boolean created = phoneRepo.createDiskPhone(phone);
        return (created) ? "|------| Disk Phone created |------|" : "|------| Disk Phone not created |------|";
    }


    public String deletePhone(int id) {
        boolean deleted = phoneRepo.deletePhone(id);
        return (deleted) ? "|------| Phone deleted |------|" : "|------| Phone not deleted |------|";
    }

    public String updatePhoneName(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneName(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneCompany(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneCompany(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneAmountLeft(int id, int newValue) {
        boolean updated = phoneRepo.updatePhoneAmountLeft(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneCost(int id, float newValue) {
        boolean updated = phoneRepo.updatePhoneCost(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneConnectionType(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneConnectionType(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneNetworkType(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneNetworkType(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneOs(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneOs(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneScreenSize(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneScreenSize(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneCameraPixel(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneCameraPixel(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneSensors(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneSensors(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneAndroidVersion(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneAndroidVersion(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneIOSVersion(int id, String newValue) {
        boolean updated = phoneRepo.updatePhoneIOSVersion(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String updatePhoneFrequency(int id, int newValue) {
        boolean updated = phoneRepo.updatePhoneFrequency(id, newValue);
        return (updated) ? "|------| Phone updated |------|" : "|------| Phone not updated |------|";
    }
    public String getPhone(int id){
        Phone p = phoneRepo.getPhone(id);
        return (p != null) ? p.toString() : "|------| Phone not found |------|";
    }

    public String getAllPhones() {
        String displayOfMarketPlays = "";
        List<Phone> phones = phoneRepo.getAllPhones();
        for(Phone p : phones){
            displayOfMarketPlays += p.toString() + "\n";
        }
        return displayOfMarketPlays;
    }
}
