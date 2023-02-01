package Entities.Objects.Phones.Wire.Button;

import Entities.Objects.Phones.Wire.WiredPhone;

public class ButtonPhone extends WiredPhone {
    public ButtonPhone(int id, String name, String company, int amountLeft, float cost, String connectionType) {
        super(id, name, company, amountLeft, cost, connectionType);
    }

    public ButtonPhone(String name, String company, int amountLeft, float cost, String connectionType) {
        super(name, company, amountLeft, cost, connectionType);
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}
