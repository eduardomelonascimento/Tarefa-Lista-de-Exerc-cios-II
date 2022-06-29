package Immobile;

public class OldImmobile extends Immobile {

    public OldImmobile(String adress, double price) {
        super(adress, price);
    }

    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
