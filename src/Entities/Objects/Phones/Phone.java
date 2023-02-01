package Entities.Objects.Phones;

public abstract class Phone {
    private int id;
    private String name;
    private String company;
    private int amountLeft;
    private float cost;

    public Phone(int id, String name, String company, int amountLeft, float cost) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.amountLeft = amountLeft;
        this.cost = cost;
    }

    public Phone(String name, String company, int amountLeft, float cost) {
        this.name = name;
        this.company = company;
        this.amountLeft = amountLeft;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(int amountLeft) {
        this.amountLeft = amountLeft;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + '{' +
                "id=" + id +
                ", company='" + company + '\'' +
                ", amountLeft=" + amountLeft +
                ", cost=" + cost;
    }
}
