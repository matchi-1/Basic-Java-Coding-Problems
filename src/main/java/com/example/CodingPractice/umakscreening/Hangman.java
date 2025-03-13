package com.example.CodingPractice.umakscreening;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String[] randomWords = {"dioses", "vivien", "regala", "joelcruz", "centeno", "hakdog"};
        String[] hangman = {"        |",
                            "        |\n        O",
                            "        |\n        O\n       /",
                            "        |\n        O\n       /|",
                            "        |\n        O\n       /|\\",
                            "        |\n        O\n       /|\\\n       /",
                            "        |\n        O\n       /|\\\n       / \\"};
        int attempts = 7;
        Random random = new Random();
        String correctAnswer = randomWords[random.nextInt(randomWords.length - 1)];
        System.out.println("Correct Answer: " + correctAnswer);
        StringBuilder updatedAnswer = new StringBuilder();
        updatedAnswer.append("_".repeat(correctAnswer.length()));

        while (attempts > 0 && String.valueOf(updatedAnswer).contains("_")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nGive me a letter to guess the word!\nYou have " + attempts + " attempts left.");

            System.out.println(updatedAnswer);
            System.out.print("\n\n>> Your letter: " );
            char ans = Character.toLowerCase(sc.next().charAt(0));

            if(correctAnswer.contains(String.valueOf(ans))){

                for (int i = 0; i < correctAnswer.length(); i++){
                    if(correctAnswer.charAt(i) == ans){
                        updatedAnswer.replace(i, i+1, String.valueOf(ans));
                    }
                }
            } else {
                System.out.println("WRONG!!");
                System.out.println(hangman[7-attempts]);
                attempts--;
            }
        }

        if(attempts > 0){
            System.out.println(updatedAnswer);
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOST");
        }

    }
}
