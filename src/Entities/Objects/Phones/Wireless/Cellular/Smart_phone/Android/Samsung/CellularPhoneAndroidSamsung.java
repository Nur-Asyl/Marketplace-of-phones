package Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.Samsung;

import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android.CellularPhoneAndroid;

public class CellularPhoneAndroidSamsung extends CellularPhoneAndroid {
    private String manufacturer;

    public CellularPhoneAndroidSamsung(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion) {
        super(id, name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        this.manufacturer = "Samsung";
    }

    public CellularPhoneAndroidSamsung(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion) {
        super(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, androidVersion);
        this.manufacturer = "Samsung";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CellularPhoneAndroidSamsung{" + super.toString() + '}';
    }
}
