package Cipher;

import java.util.Scanner;

/**
 * Class: Tester
 * Author: William Chokbengboune
 * Date: 4/23/2023
 * Version: 1.0
 * Description: This class is meant to take the given string and change it based on the given key
 */
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Encrypt en = new Encrypt();
        Key ky = new Key();
        Decrypt dt = new Decrypt();

        System.out.println("Enter the phrase or word: ");
        String word = in.nextLine();//this is the original phrase
        System.out.println("Enter the key: ");
        int shift = ky.getKey();//this should get the key method to save the key
        System.out.println("Would you like for the code to be encrypt or decrypt? ");
        String option = in.nextLine();
        switch (option){//this will check the user input if it is either one
            case "encrypt":
                System.out.println(en.toEncrypt(word, shift));
                break;
            case "decrypt":
                System.out.println(dt.toDecrypt(word, shift));
                break;
        }
    }
}
