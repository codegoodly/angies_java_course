package chapter4;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double baseCost = getBaseCost();
        double overageFees = calculateOverageFees();
        double tax = calculateTax(baseCost, overageFees);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost );
        System.out.println("Overage: $" + overageFees);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + calculateTotal(baseCost, overageFees, tax));

    }
    public static double getBaseCost(){
        System.out.println("Enter the base cost of the plan: ");
        return scanner.nextDouble();
    }

    public static double calculateOverageFees() {
        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();
        double fee = 0.25;
        return overageMinutes * fee;
    }

    public static double calculateTax(double baseCost, double overageFees) {
        double tax = 0.15;
        return (baseCost + overageFees) * tax;
    }

    public static double calculateTotal(double baseCost, double overageFees, double tax) {
        return baseCost + overageFees + tax;
    }

}
