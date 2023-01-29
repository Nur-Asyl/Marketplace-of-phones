package Entities.Objects.Phones.Wireless.Cellular.Smart_phone.IOS;

import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.CellularPhoneSmartPhone;

public class CellularPhoneIOS extends CellularPhoneSmartPhone {
    private String iosVersion;

    public CellularPhoneIOS(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String camera_pixel, String cameraPixel, String sensors, String iosVersion) {
        super(id, name, company, amountLeft, cost, networkType, os, camera_pixel, cameraPixel, sensors);
        this.iosVersion = iosVersion;
    }

    public CellularPhoneIOS(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String iosVersion) {
        super(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors);
        this.iosVersion = iosVersion;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "iosVersion='" + iosVersion + '\'' +
                '}';
    }
}
