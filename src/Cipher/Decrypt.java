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
