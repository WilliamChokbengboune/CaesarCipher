package Cipher;

import java.util.Scanner;

public class Key {
    private int shift;

    public Key(){
    }
    public Key(int shift){
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
    public int getKey(){
        Scanner in = new Scanner(System.in);
        int getKey = in.nextInt();
        return getKey;
    }
}
