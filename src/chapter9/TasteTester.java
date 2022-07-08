package chapter9;

public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake("Banana");
        cake.setPrice(30);
        BirthdayCake birthdayCake = new BirthdayCake("chocolate");
        birthdayCake.setPrice(40);
        birthdayCake.setCandles(30);
        WeddingCake weddingCake = new WeddingCake("Raspberry");
        weddingCake.setPrice(100);
        weddingCake.setTiers(3);

        printFlavorAndPrice(cake);
        printFlavorAndPrice(birthdayCake);
        printFlavorAndPrice(weddingCake);

    }

    public static void printFlavorAndPrice(Cake cake) {
        System.out.println("This cake" + " costs: $" + cake.getPrice() + " and tastes like: " + cake.getFlavor());
    }

}
