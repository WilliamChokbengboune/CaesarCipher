package Cipher;

public class Encrypt {
    private String word;
    public Encrypt(String word){
        this.word = word;
    }

    public Encrypt() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String toEncrypt(String word, int key){
        StringBuilder encryptedMessage = new StringBuilder();//This is meant to store the String that is translated
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);

            if (Character.isLetter(c)){
                c = (char) ((c - 'a' + key + 26) % 26 + 'a');
            }
            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
    }
}
