package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I fucking love school of applied technology");
        reverseString(".sdrawkcab yllaer si sihT");
        System.out.println();
        reverseString(".netofkab mo ttåf tlla ud rah räh teD");
        System.out.println();
        System.out.println(reverseString2("varg") + "ad lax");
        addSpaces("Hjälp,MellanslagFunkarInte!");
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

    public static void reverseString(String text) {
        for (int i = text.length(); i > 0 ; i--) {
            System.out.print(text.charAt(i -1));
        }

    }

    public static String reverseString2(String text) {
        String reversed = "";
        for (int i = text.length(); i >0 ; i--) {
           reversed = reversed.concat(String.valueOf(text.charAt(i - 1)));
           //reversed = reversed.concat("A");
        }
        return reversed;

    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
