package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7 ");
        int index = scanner.nextInt();
        scanner.close();
        System.out.println("The number " + index + " corresponds to " +
                week[index-1]);
    }
}
