package Entities.Objects.Phones.Wireless.Cellular.Smart_phone.Android;

import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.CellularPhoneSmartPhone;

public class CellularPhoneAndroid<T> extends CellularPhoneSmartPhone {
    private String androidVersion;

    public CellularPhoneAndroid(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion) {
        super(id, name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors);
        this.androidVersion = androidVersion;
    }

    public CellularPhoneAndroid(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String androidVersion) {
        super(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors);
        this.androidVersion = androidVersion;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                "androidVersion='" + androidVersion + '\'' + "}";
    }
}
