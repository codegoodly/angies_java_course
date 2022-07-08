package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Animal lassie = new Dog();
        lassie.makeSound();
        ((Dog) lassie).fetch();

        Animal sixten = new Dog();
        sixten.makeSound();
        sixten = new Cat();
        sixten.makeSound();
        System.out.println();

        feedAnimal(lassie);
        feedAnimal(sixten);

    }

    public static void feedAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println();
            System.out.println("Here you got buddy!");
        } else if (animal instanceof Cat) {
            System.out.println();
            System.out.println("Here kitty, kitty");
        }
        animal.makeSound();

    }
}
