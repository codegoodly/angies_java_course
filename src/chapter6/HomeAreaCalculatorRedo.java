package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
        Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculatorRedo = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculatorRedo.getRoom();
        Rectangle bathroom = calculatorRedo.getRoom();
        double area = calculatorRedo.calculateTotalArea(kitchen,bathroom);

        System.out.println(area);

        calculatorRedo.scanner.close();
    }

    public Rectangle getRoom() {
        System.out.println("Enter the width of your room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the length of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(width,length);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
