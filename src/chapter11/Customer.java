package chapter11;

public class Customer {

    public static void main(String[] args) {

        Product book = new Book();
        book.setPrice(100);
        System.out.println(book.getPrice());
    }
}
