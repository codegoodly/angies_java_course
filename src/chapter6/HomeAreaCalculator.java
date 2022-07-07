package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setWidth(10);
        room1.setLength(20);
        Rectangle room2 = new Rectangle(4, 10);
        double totalArea = room1.calculateArea() + room2.calculateArea();
        System.out.println(totalArea);
    }
}
