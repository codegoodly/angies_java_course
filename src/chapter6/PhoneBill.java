package chapter6;

public class PhoneBill {

    private int ID;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        ID = 1;
        baseCost = 100;
        allottedMinutes = 600;
        minutesUsed = 0;
    }

    public PhoneBill(int ID) {
        setID(ID);
        baseCost = 100;
        allottedMinutes = 600;
        minutesUsed = 0;
    }

    public PhoneBill(int ID, double baseCost, int allottedMinutes, int minutesUsed) {
        setID(ID);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    public void setAllottedMinutes(int minutes) {
        this.allottedMinutes = minutes;
    }
    public void setMinutesUsed(int minutes) {
        this.minutesUsed = minutes;
    }

    public int getID() {
        return ID;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public double calculateOverage() {
        double rate = 0.25;
        if (minutesUsed > allottedMinutes) {
            return (minutesUsed - allottedMinutes) * rate;
        }
        else return 0;
    }

    public double calculateTax() {
        double rate = 0.15;
        return (baseCost + calculateOverage()) * rate;
    }

    public double calculateTotal() {
        return baseCost + calculateTax() + calculateOverage();
    }
    public void printBill() {
        System.out.println("Phone bill statement");
        System.out.println("Plan: $" + baseCost );
        System.out.println("Overage: $" + calculateOverage());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }
}
