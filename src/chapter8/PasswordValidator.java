package chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private static String username;
    private static final Scanner scanner = new Scanner(System.in);
    private static String password;

    public static void main(String[] args) {
        System.out.println("Username: ");
        username = scanner.next();
        System.out.println("Password: ");
        password = scanner.next();
        System.out.println("Enter your new password: ");
        String newPassword = scanner.next();
        checkPassword(newPassword);


    }

    public static void checkPassword(String password) {
        while (!(longEnough(password))
                || equalsUsernameOrPassword(password)
                || !containsUppercaseLetter(password)
                || !containsSpecialChar(password) ) {

            System.out.println("Invalid password. "  + " Try again. ");
            password = scanner.next();
        }
        System.out.println("Success!");
        System.out.println("Your new password is: " + password);
    }

    public static boolean equalsUsernameOrPassword(String text) {
        if (text.equalsIgnoreCase(username) || text.equalsIgnoreCase(password)) {
            System.out.println("Your new password can not be the same as your username or old password. ");
            return true;
        } else return false;
    }

    public static boolean containsSpecialChar(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!(Character.isAlphabetic(text.charAt(i)))) {
                System.out.println("Your new password has to contain at least one special character. ");
                return true;
            }

        }
        return false;
    }

    public static boolean containsUppercaseLetter(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                System.out.println("Your new password has to contain at least one UPPERCASE letter. ");
                return true;
            }

        }
        return false;
    }
    public static boolean longEnough(String text) {
        if (text.length() >= 8) {
            return true;
        } else {
            System.out.println("Your new password has to be longer than 8 characters. ");
            return false;
        }
    }
}
