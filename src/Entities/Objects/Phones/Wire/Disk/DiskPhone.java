package Entities.Objects.Phones.Wire.Disk;

import Entities.Objects.Phones.Wire.WiredPhone;

public class DiskPhone extends WiredPhone {
    public DiskPhone(int id, String name, String company, int amountLeft, float cost, String connectionType) {
        super(id, name, company, amountLeft, cost, connectionType);
    }

    public DiskPhone(String name, String company, int amountLeft, float cost, String connectionType) {
        super(name, company, amountLeft, cost, connectionType);
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}
