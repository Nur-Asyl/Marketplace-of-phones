package Entities.Purchases;

public class Purchase {
    private int id;
    private int userId;
    private int phoneId;
    private boolean isBought;

    public Purchase(int id, int userId, int phoneId, boolean isBought) {
        this.id = id;
        this.userId = userId;
        this.phoneId = phoneId;
        this.isBought = isBought;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", userId=" + userId +
                ", phoneId=" + phoneId +
                ", isBought=" + isBought +
                '}';
    }
}
