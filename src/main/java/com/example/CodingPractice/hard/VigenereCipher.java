package com.example.CodingPractice.hard;

/*
Write a program to encrypt and decrypt text using the Vigenère cipher. The Vigenère cipher is a method of encrypting alphabetic text by using a keyword.
Each letter in the keyword shifts the corresponding letter in the plaintext by its position in the alphabet.

Encryption Process
1.	The Vigenère cipher uses a keyword to shift each character in the plaintext.
2.	For each letter in the plaintext:
    o	Use the corresponding letter in the keyword to determine the shift. (e.g., if the keyword letter is "B", shift by 1; if "C", shift by 2).
    o	Apply this shift to the plaintext letter to create the ciphertext letter.
3.	If the plaintext is longer than the keyword, repeat the keyword from the beginning.

Decryption Process
1.	To decrypt, shift each letter in the ciphertext backwards by the amount indicated by the corresponding letter in the keyword.


*/

import java.util.Scanner;

public class VigenereCipher {

    // encrypt the plaintext
    public static String encrypt(String plaintext, String keyword) {
        StringBuilder ciphertext = new StringBuilder();
        int keywordIndex = 0;

        // iterate over plaintext
        for (char ch : plaintext.toCharArray()) {
            // only process alpha chars
            if (Character.isAlphabetic(ch)) {
                char upperCh = Character.toUpperCase(ch);
                char upperKeyword = Character.toUpperCase(keyword.charAt(keywordIndex % keyword.length()));

                // calc shift
                int shift = upperKeyword - 'A';
                char encryptedChar = (char) (((upperCh - 'A' + shift) % 26) + 'A');
                ciphertext.append(encryptedChar);

                keywordIndex++;
            }
        }
        return ciphertext.toString();
    }

    // decrypt ciphertext
    public static String decrypt(String ciphertext, String keyword) {
        StringBuilder plaintext = new StringBuilder();
        int keywordIndex = 0;

        // iterate over cipher text
        for (char ch : ciphertext.toCharArray()) {

            if (Character.isAlphabetic(ch)) {
                char upperCh = Character.toUpperCase(ch);
                char upperKeyword = Character.toUpperCase(keyword.charAt(keywordIndex % keyword.length()));

                // calc shift (reverse of encrypt)
                int shift = upperKeyword - 'A';
                char decryptedChar = (char) (((upperCh - 'A' - shift + 26) % 26) + 'A');
                plaintext.append(decryptedChar);

                keywordIndex++;
            }
        }
        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // encryption
        System.out.println("Enter plaintext: ");
        String plaintext = scanner.nextLine();
        System.out.println("Enter keyword: ");
        String keyword = scanner.nextLine();

        String encryptedText = encrypt(plaintext, keyword);
        System.out.println("Ciphertext: " + encryptedText);

        // decryption
        System.out.println("Enter ciphertext: ");
        String ciphertext = scanner.nextLine();
        System.out.println("Enter keyword: ");
        String decryptKeyword = scanner.nextLine();

        String decryptedText = decrypt(ciphertext, decryptKeyword);
        System.out.println("Plaintext: " + decryptedText);

        scanner.close();
    }
}
