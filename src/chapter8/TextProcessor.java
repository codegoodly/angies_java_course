package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I fucking love school of applied technology");

    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
