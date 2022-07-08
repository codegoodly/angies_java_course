package chapter9;

public class Cake {
    private String flavor;
    private int price;

    public Cake() {
        flavor = "Strawberry";
        price = 10;

    }
    public Cake(String flavor) {
        setFlavor(flavor);
        price = 10;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
