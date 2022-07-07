package chapter4;

import java.util.Random;

public class RolltheDieGame {

    public static void main(String[] args) {
        Random random = new Random();
        int die;
        int maxRolls = 5;
        int currentSpace = 0;
        int lastSpace = 20;
        int spacesLeft;
        for (int i = 1; i <= maxRolls; i++) {
            die = random.nextInt(6) + 1;
            currentSpace += die;
            System.out.printf("Roll #%d: You've rolled a %d. " , i , die);
            if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            } else if (i == maxRolls) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to space " + lastSpace + " You lose!");

            } else {
                spacesLeft = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesLeft + " more to go.");
            }
            System.out.println();


        }

    }
}