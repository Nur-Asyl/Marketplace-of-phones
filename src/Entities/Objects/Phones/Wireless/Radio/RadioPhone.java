package Entities.Objects.Phones.Wireless.Radio;

import Entities.Objects.Phones.Wireless.WirelessPhone;

public class RadioPhone extends WirelessPhone {
    private int frequency;

    public RadioPhone(int id, String name, String company, int amountLeft, float cost, String networkType, String os, int frequency) {
        super(id, name, company, amountLeft, cost, networkType, os);
        this.frequency = frequency;
    }

    public RadioPhone(String name, String company, int amountLeft, float cost, String networkType, String os, int frequency) {
        super(name, company, amountLeft, cost, networkType, os);
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                "frequency=" + frequency +
                "}";
    }
}
