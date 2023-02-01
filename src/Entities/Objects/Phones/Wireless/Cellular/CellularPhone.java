package Entities.Objects.Phones.Wireless.Cellular;

import Entities.Objects.Phones.Wireless.WirelessPhone;

public abstract class CellularPhone extends WirelessPhone {
    private String screenSize;
    private String cameraPixel;

    public CellularPhone(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel) {
        super(id, name, company, amountLeft, cost, networkType, os);
        this.screenSize = screenSize;
        this.cameraPixel = cameraPixel;
    }

    public CellularPhone(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel) {
        super(name, company, amountLeft, cost, networkType, os);
        this.screenSize = screenSize;
        this.cameraPixel = cameraPixel;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getCameraPixel() {
        return cameraPixel;
    }

    public void setCameraPixel(String cameraPixel) {
        this.cameraPixel = cameraPixel;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                "screenSize='" + screenSize + '\'' +
                ", cameraPixel='" + cameraPixel + '\'';
    }
}
