package Entities.Objects.Phones.Wireless.Cellular.Smart_phone;

import Entities.Objects.Phones.Wireless.Cellular.Base_model.CellularPhoneBaseModel;
import Entities.Objects.Phones.Wireless.Cellular.CellularPhone;

public abstract class CellularPhoneSmartPhone extends CellularPhone {
    private String sensors; //Sensors: The types of sensors built into the phone, such as accelerometer, gyroscope,

    public CellularPhoneSmartPhone(int id, String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors) {
        super(id, name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel);
        this.sensors = sensors;
    }

    public CellularPhoneSmartPhone(String name, String company, int amountLeft, float cost, String networkType, String os, String screenSize, String cameraPixel, String sensors) {
        super(name, company, amountLeft, cost, networkType, os, screenSize, cameraPixel);
        this.sensors = sensors;
    }

    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "sensors='" + sensors + '\'' +
                '}';
    }
}
