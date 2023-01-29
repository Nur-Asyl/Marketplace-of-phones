package Entities.Objects.Phones.Wire;

import Entities.Objects.Phones.Phone;

public class WiredPhone extends Phone {
    private String connectionType;


    public WiredPhone(int id, String name, String company, int amountLeft, float cost, String connectionType) {
        super(id, name, company, amountLeft, cost);
        this.connectionType = connectionType;
    }

    public WiredPhone(String name, String company, int amountLeft, float cost, String connectionType) {
        super(name, company, amountLeft, cost);
        this.connectionType = connectionType;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "WiredPhone" + super.toString() + "{" +
                "connectionType='" + connectionType + '\'' +
                '}';
    }
}
