package Immobile;

public class NewImmobile extends Immobile {
   
    public NewImmobile(String adress, double price) {
        super(adress, price);
    }

    private double additionalCost;

    public double getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(double additionalCost) {
        this.additionalCost = additionalCost;
    }

}
