package chapter2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MadLIbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a season of the year: ");
        String season = scanner.next();

        System.out.println("Think of a number: ");
        int number = scanner.nextInt();

        System.out.println("Give me an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
