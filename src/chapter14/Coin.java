package chapter14;

import java.util.Random;

public class Coin {
    private String side;
    private static final String HEADS = "Heads";
    private static final String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        System.out.println("*Flips coin*");
        System.out.println();
        Random random = new Random();
        int number = random.nextInt(2);
        switch (number) {
            case 0:
                setSide(HEADS);
            case 1:
                setSide(TAILS);

        }

    }
}
