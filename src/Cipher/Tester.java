package Cipher;

import java.util.Scanner;

/**
 * Class: Tester
 * Author: William Chokbengboune
 * Date: 4/14/2023
 * Version: 1.0
 * Description: This class is meant to take the given string and change it based on the given key
 */
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tester test = new Tester();
        Encrypt en = new Encrypt();
        Key ky = new Key();
        Decrypt dt = new Decrypt();

        System.out.println("Enter the phrase or word: ");
        String word = in.nextLine();//this is the original phrase
        System.out.println("Enter the key: ");
        int shift = ky.getKey();//this should get the key method to save the key
        System.out.println("Would you like for the code to be encrypted or decrypted? ");
        String option = in.nextLine();
        if (option == "encrypted"){
            System.out.println(en.toEncrypt(word, shift));
        } else if (option == "decrypt") {
            System.out.println(dt.toDecrypt(word, shift));
        }
    }
}
