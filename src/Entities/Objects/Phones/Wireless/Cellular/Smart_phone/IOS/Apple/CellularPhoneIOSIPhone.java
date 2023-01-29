package Entities.Objects.Phones.Wireless.Cellular.Smart_phone.IOS.Apple;

import Entities.Objects.Phones.Wireless.Cellular.Smart_phone.IOS.CellularPhoneIOS;

public class CellularPhoneIOSIPhone extends CellularPhoneIOS {
    private String manufacturer;

    public CellularPhoneIOSIPhone(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String camera_pixel, String cameraPixel, String sensors, String iosVersion) {
        super(id, name, company, amountLeft, cost, networkType, os, camera_pixel, cameraPixel, sensors, iosVersion);
        this.manufacturer = "Apple";
    }

    public CellularPhoneIOSIPhone(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors, String iosVersion) {
        super(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel, sensors, iosVersion);
        this.manufacturer = "Apple";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CellularPhoneIOSIPhone{" + super.toString() + '}';
    }
}
