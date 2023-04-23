/**
 * Class: Tester
 * Author: William Chokbengboune
 * Date: 4/23/2023
 * Version: 1.0
 * Description: This class is meant to take the given string and change it based on the given key
 */
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
