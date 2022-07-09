package chapter13;

public class DivideByZero {
    public static void main(String[] args) {

        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        finally {
            System.out.println("Division is fun!");

        }
    }




}
