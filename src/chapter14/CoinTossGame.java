package chapter14;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Coin coin = new Coin();
        Player player1 = new Player("Konrad");
        Player player2 = new Player("Oskar");
        Scanner scanner = new Scanner(System.in);

        String guess;
        do {
            System.out.println(player1.getName() + ", heads or tails?");
            guess = scanner.next().toLowerCase();
        } while (invalidGuess(guess));
        scanner.close();
        player1.setGuess(guess);
        System.out.println();
        System.out.println(player1.getName() + " chose " + player1.getGuess());
        //System.out.println(player1.getGuess().toLowerCase());
        if ("heads".equals(guess)) {
            player2.setGuess("tails");

        } else if ("tails".equals(guess)) {
            player2.setGuess("heads");
        }
        System.out.println(player2.getName() + " is assigned " + player2.getGuess());
        System.out.println();

        coin.flip();
        System.out.println(coin.getSide() + "!");
        System.out.println();
        String winner = coin.getSide().equalsIgnoreCase(player1.getGuess()) ? player1.getName() : player2.getName();

        System.out.println("The winner is: " + winner + "!");

    }

    public static boolean invalidGuess(String guess) {
        return !guess.equalsIgnoreCase("heads") && !guess.equalsIgnoreCase("tails");

    }
}
