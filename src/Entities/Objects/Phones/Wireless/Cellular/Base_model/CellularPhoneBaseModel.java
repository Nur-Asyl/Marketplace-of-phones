package Entities.Objects.Phones.Wireless.Cellular.Base_model;

import Entities.Objects.Phones.Wireless.Cellular.CellularPhone;

public class CellularPhoneBaseModel extends CellularPhone {

    public CellularPhoneBaseModel(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel) {
        super(id, name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel);
    }

    public CellularPhoneBaseModel(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel) {
        super(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel);
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}
