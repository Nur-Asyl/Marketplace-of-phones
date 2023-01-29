package Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Oppo;

import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.CellularPhoneAndroid;

public class CellularPhoneAndroidOppo extends CellularPhoneAndroid {
    private String manufacturer;

    public CellularPhoneAndroidOppo(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion) {
        super(id, name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        this.manufacturer = "Oppo";
    }

    public CellularPhoneAndroidOppo(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion) {
        super(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        this.manufacturer =  "Oppo";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CellularPhoneAndroidOppo{" + super.toString() + '}';
    }
}
