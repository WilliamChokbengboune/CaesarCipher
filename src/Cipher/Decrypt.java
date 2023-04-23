/**
 * Class: Tester
 * Author: William Chokbengboune
 * Date: 4/23/2023
 * Version: 1.0
 * Description: This class is meant to take the given string and change it based on the given key
 */
package Cipher;
public class Decrypt {
    private String word;
    public Decrypt(String word){
        this.word = word;
    }
    public Decrypt(){
    }//non-argumentative constructor
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String toDecrypt(String word, int key){
        StringBuilder encryptedMessage = new StringBuilder();//This is meant to store the String that is translated
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (Character.isLetter(c)){
                c = (char) ((c + 'a' - key - 26) % 26 - 'a');
            }
            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
    }
}
