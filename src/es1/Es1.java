package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a number:");
        int n = sc.nextInt();

        Set<String> allWords = new HashSet<>();
        Set<String> duplicatedWord = new HashSet<>();

        System.out.println("Insert " + n + " words:");
        for (int i = 0; i <= n; i++) {

            String word = sc.nextLine();

            if (allWords.contains(word)) {
                duplicatedWord.add(word);
            } else {
                allWords.add(word);
            }
        }

        for (String word : duplicatedWord) {
            System.out.println("'" + word + "'" + " is duplicated.");
        }

        System.out.println("Number of different words: " + allWords.size());
        System.out.println("List of all different words:");
        for (String word : allWords) {
            System.out.println(word);
        }

        sc.close();
    }
}
