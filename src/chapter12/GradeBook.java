package chapter12;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        Map<String, Integer> finalGrades = new HashMap();

        // Perhaps not very readable
        originalGrades.forEach((k,v) -> {
            if (v < makeUpGrades.get(k)) {
                finalGrades.put(k, makeUpGrades.get(k));
            } else finalGrades.put(k, v);
        });
        System.out.println("Final grades: ");
        for (var entry: finalGrades.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();
        System.out.println("**Alternate formatting**");
        System.out.println();
        System.out.println("Final grades: ");
        finalGrades.forEach((k, v) -> System.out.println(k + " : " + v));


    }
}
