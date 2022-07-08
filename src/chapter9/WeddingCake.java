package chapter9;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(String flavor) {
        super(flavor);
        tiers = 1;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
