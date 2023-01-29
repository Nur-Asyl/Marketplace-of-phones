package Entities.Objects.Phones.Wireless;

import Entities.Objects.Phones.Phone;

public abstract class WirelessPhone extends Phone {
    private String networkType;
    private String os;

    public WirelessPhone(int id, String name, String company, int amountLeft, float cost, String networkType, String os) {
        super(id, name, company, amountLeft, cost);
        this.os = os;
        this.networkType = networkType;
    }

    public WirelessPhone(String name, String company, int amountLeft, float cost, String networkType, String os) {
        super(name, company, amountLeft, cost);
        this.networkType = networkType;
        this.os = os;
    }

    public String getNetworkType() {
        return networkType;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "networkType='" + networkType + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
