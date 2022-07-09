package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        createNewFile();

        numbersExceptionHandling();
    }

    private static void numbersExceptionHandling() {
        File file = new File("Resources/numbers.txt");
            Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }  finally {
            fileReader.close();
        }
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
          //  e.printStackTrace();
        }
        System.out.println("This line is printed because the program doesn't crash.");

    }
}
