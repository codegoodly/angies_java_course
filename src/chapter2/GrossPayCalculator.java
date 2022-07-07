package chapter2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String args[]){
//        1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked. ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
//        2. Get the hourly rate
        System.out.println("Enter the employee's pay rate. ");
        double rate = scanner.nextDouble();
        scanner.close();
//        3. Multiply hours and pay rate
        double grossPay = hours * rate;
//        4. Display result
        System.out.println("The employee's gross pay is kr" + grossPay);
    }

}
